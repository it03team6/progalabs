package ua.kpi.fict.acts.it03.proga.lab12;

public class Student implements Details{
    private final String firstLastNames; // ім’я, прізвище
    private final String markBookIndex; // номер залікової книжки
    private double GPA; //середній бал
    private final Faculty faculty;

    public Student(String name, String recordBookIndex, double GPA, Faculty faculty) {
        this.firstLastNames = name;
        this.markBookIndex = recordBookIndex;
        this.GPA = GPA;
        this.faculty = faculty;
        faculty.add(this);
    }

    public String getFirstLastNames() {
        return firstLastNames;
    }

    public double getGPA() {
        return GPA;
    }

    public String getMarkBookIndex() {
        return markBookIndex;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
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
