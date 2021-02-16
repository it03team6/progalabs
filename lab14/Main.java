package ua.kpi.fict.acts.it03.proga.lab14;

import java.io.IOException;
import java.util.Arrays;

// C:/Users/anton/OneDrive/Документи/KPI/Semestr2/OP2/lab14.txt
public class Main {
    public static void main(String[] args) {
        LatinCharacters task1 = new LatinCharacters();
        String path = "C:/Users/anton/OneDrive/Документи/KPI/Semestr2/OP2/lab14.txt";
       long ans = task1.numberOfLatinCharacters(path);
        System.out.println(ans);
        try {
            System.out.println(task1.readAllCharsOneByOne(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Task2 task2 = new Task2(path);
        try {
            System.out.println(Arrays.toString(task2.getByteArray()));
            System.out.println(task2.checkSum());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
