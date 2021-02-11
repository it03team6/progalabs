package ua.kpi.fict.acts.it03.proga.lab12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class University implements Details{
    private HashSet<Faculty> faculties = new HashSet<>();
    private String universityName;

    public University(HashSet<Faculty> faculties, String universityName) {
        this.faculties = faculties;
        this.universityName = universityName;
    }

    public University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void add(Faculty faculty) {
        if (faculties.contains(faculty)) {
            System.out.println("Ошибка это факультет уже принадлежит институту");
        } else {
            faculties.add(faculty);
        }
    }

    //задание 2)
    public void  mostStudents() {
        Faculty answer = null;
        Iterator<Faculty> iterator = faculties.iterator();
        String nullAnswer = "В инстритуте нету факультетов или количество студентов в факультетах равно 0";
        int tempStudents = 0;
        while (iterator.hasNext()) {
            Faculty tempFaculty = iterator.next();
            if (tempFaculty.countStudents() > tempStudents) {
                tempStudents = tempFaculty.countStudents();
                answer = tempFaculty;
            }
        }
        System.out.println( answer == null ? nullAnswer : "Это факультет: " + answer.getName());
    }

    // Функция  Задание 1)
    public int countStudents() {
        int quantity = 0;
        for (Faculty fac: faculties){
            quantity += fac.countStudents();

        }
        return quantity;
    }


    // Фукнция задание 3)
    private HashSet<Student> bestStudents() {
        HashSet<Student> bestStudents = new HashSet<>();
        Iterator <Faculty> iterator = faculties.iterator();

        while (iterator.hasNext()){
            Faculty fac = iterator.next();
            Iterator <Student> iterator1 = fac.getStudents().iterator();
            while (iterator1.hasNext()){
                Student stud = iterator1.next();
                if (stud.getGPA() >= 95){
                    bestStudents.add(stud);
                }
            }

        }

        return bestStudents;
    }

    // Функция возвращает список лучших студентов с их именнами как Строку.
//    public void showBestStudents() {
//        TreeMap<String> bestStudents = new TreeMap<>();  // <-- FIX
//        for (Student student : bestStudents()) {
//            bestStudents.(student.getFirstLastNames());
//        }
//        System.out.println(bestStudents.toString());
//    }

    //Метод ищет студента по номеру заликовки
    // Тут бы добавить еще проверку на правильность введения номер зачетки
    public void findStudent(String markBookIndex) {

        for (Faculty faculty : faculties) {
            for (Student student : faculty.getStudents()) {
                if (student.getMarkBookIndex().equals(markBookIndex)) {
                    System.out.println("Студент по запросу: " + markBookIndex + " найден. Вот информация:");
                    student.getDetails();
                    return;
                }
            }
        }
        System.out.println("Студент по запросу:" + markBookIndex + " не найден.");
    }

    @Override
    public void getDetails() {
        System.out.println(
                "Вся информация о Институте:" +
                        "\nНазвание: " + universityName +
                        "\nФакультеты: " + getStringOfFaculties() +
                        "\nКоличество учеников: " + countStudents()
        );
    }
    

    private String getStringOfFaculties() {
        //  StringBuilder allFaculties = new StringBuilder();
        HashSet<String> allFaculties = new HashSet<>();
        for (Faculty faculty : faculties) {
            allFaculties.add(faculty.getName());
        }
        return allFaculties.toString();
    }
}
