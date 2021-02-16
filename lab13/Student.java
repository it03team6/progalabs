package ua.kpi.fict.acts.it03.proga.lab13;

import java.util.Objects;


public class Student implements Details{
    private final String firstLastNames; // ім’я, прізвище
    private String markBookIndex; // номер залікової книжки
    private double GPA; //середній бал
    private final Faculty faculty;

    public Student(String name, String recordBookIndex, String GPA, Faculty faculty) throws GPAException, IllegalArgumentException/*MarkBookException*/ {
        try {
            double parsed = Double.parseDouble(GPA);
            setGPA(parsed);
            setMarkBookIndex(recordBookIndex);
            faculty.add(this);
        }catch (NumberFormatException e){
            throw new GPAException("String is incorrect", e);
        } catch (GPAException ex) {
            System.err.println(ex.getMessage());

        }
        this.firstLastNames = name;
//        this.markBookIndex = recordBookIndex;
        this.faculty = faculty;
//        if (getGPA() >= 60){
//
//        }
    }

    public String getFirstLastNames() {
        return firstLastNames;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return markBookIndex.equals(student.markBookIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markBookIndex);
    }

    public String getMarkBookIndex() {
        return markBookIndex;
    }

    public void setGPA(double GPA) throws GPAException {
        if (GPA < 60){
           throw new GPAException("Средний балл меньше 60, студент отчислен");
        }
        else {
            this.GPA = GPA;
        }
    }
    public void setMarkBookIndex(String markBookIndex) throws IllegalArgumentException /*MarkBookException*/ {

        if (!markBookIndex.matches("^[A-Z]{4}[0-9]{4}$")){
            throw new IllegalArgumentException /*MarkBookException*/("Формат студентческого не верный, вы не студент КПИ");
        }
        else {
            this.markBookIndex = markBookIndex;
        }
    }
    @Override
    public String toString() {
        return  "ФИО:" + firstLastNames;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    @Override
    public void getDetails() {
        System.out.println(
                "Вся информация о студенте:" +
                        "\nФИО: " +this.firstLastNames +
                        "\nИнститут: " + faculty.getInstitute().getUniversityName() +
                        "\nФакультет: " + faculty.getName() +
                        "\nНомер студенческого: " + this.markBookIndex +
                        "\nСредний бал: " + this.GPA

        );
    }
}
