package ua.kpi.fict.acts.it03.proga.lab14;

import java.io.*;

public class LatinCharacters {


    public long numberOfLatinCharacters(String filename) {
        int counter = 0;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        int i = 0;
        try {
            fis = new FileInputStream(filename);
            isr = new InputStreamReader(fis, "UTF-8");
            while ((i = isr.read()) != -1) {
                if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return counter;
    }

    public long readAllCharsOneByOne(String adress) throws IOException {
        BufferedReader readerok = new BufferedReader(new FileReader(adress));
       // System.out.println(readerok);
        int value;
        int counter = 0;
        while ((value = readerok.read()) != -1) {
            if (( value >= 65 && value <= 90) || (value >= 97 && value <= 122))
                counter++;
        }
        readerok.close();
        return counter;
    }
}

