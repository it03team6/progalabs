package ua.kpi.fict.acts.it03.proga.lab13;

public class Main {
    public static void main(String[] args) {
        University KPI = new University("KPI");
        Faculty FICT = new Faculty("FICT", KPI);
        Faculty FMM = new Faculty("FMM", KPI);
        Student emad = null;
        try {
            emad = new Student("Hamad Emad", "QWER3234", "99", FICT);
            emad.getDetails();


        } catch (GPAException e) {
            System.err.println(e.getMessage());
            /*e.printStackTrace();*/        }


      //  Student emad = new Student("Hamad Emad", "QWER1234", "qq", FICT);

      //  Student anton = new Student("Chaban Anton", "ASDF5678", "99.7", FICT);

        // Student anna = new Student("Petrova Anna", "BEEP1337", "99.8", FICT);


        KPI.getDetails();

/*       System.out.println(nickita.equals(nick));
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
        KPI.mostStudents();*/
    }
}
