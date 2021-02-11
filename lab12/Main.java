package ua.kpi.fict.acts.it03.proga.lab12;

public class Main {
    public static void main(String[] args) {
        University KPI = new University("KPI");
        Faculty FICT = new Faculty("FICT", KPI);
        Faculty FMM = new Faculty("FMM", KPI);
        Student emad = new Student("Hamad Emad", "QWER1234", 9.6, FICT);
        Student anton = new Student("Chaban Anton", "ASDF5678", 99.7, FMM);
        Student nickita = new Student("Nick Phil", "ZXCV9012", 99.8, FICT);


        KPI.showBestStudents();
        System.out.println(KPI.countStudents());
        KPI.mostStudents();
        KPI.findStudent("AE333333");

        System.out.println("########");

        emad.getDetails();
        System.out.println();
        anton.getDetails();
        System.out.println();
        nickita.getDetails();
        System.out.println();
        FICT.getDetails();
        System.out.println();
        FMM.getDetails();
        System.out.println();
        KPI.getDetails();
        System.out.println();
       // KPI.showBestStudents();
        System.out.println();
        KPI.mostStudents();
    }
}
