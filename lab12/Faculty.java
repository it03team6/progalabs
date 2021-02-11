package ua.kpi.fict.acts.it03.proga.lab12;

import java.util.HashSet;

public class Faculty implements Details{
    private final String facName;
    private final University university;
    private HashSet<Student> students = new HashSet<>();

    public Faculty(String facName, University university, HashSet<Student> students) {
        this.facName = facName;
        this.university = university;
        this.students = students;
        university.add(this);
    }

    public Faculty(String name, University institute) {
        this.facName = name;
        this.university = institute;
        institute.add(this);
    }

    public void add(Student student) {
        if (students.contains(student)) {
            System.out.println("Ошибка этот студент уже учится на этом факультете");
        }
        else {
            students.add(student);
        }
    }

    public University getInstitute() {
        return university;
    }

    public String getName() {
        return facName;
    }

    public HashSet<Student> getStudents() {
        return students;
    }
    public int countStudents() {
        int quantity = 0;
        for (Student student : students) {
            quantity++;
        }
        return quantity;
    }

    @Override
    public void getDetails() {
        System.out.println(
                "Вся информация о факультете:" +
                        "\nНазвание: " + facName +
                        "\nКоличество учеников: " +countStudents()
        );

    }
}
