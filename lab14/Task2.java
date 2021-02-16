package ua.kpi.fict.acts.it03.proga.lab14;

import java.io.*;

public class Task2 {
    private final String path;

    public Task2(String path) {
        this.path = path;
    }

    public byte checkSum() throws IOException {
        byte xorArr = 0;
        byte[] bytes = getByteArray();
        for (int i = 0; i < bytes.length; i++) {
            if(i == 0){
                xorArr = (byte) (bytes[i] ^ bytes[i+1]);
                i++;
            }
            else
            {
                xorArr = (byte) (xorArr ^ bytes[i]);
            }
           // xorArr = (byte) (xorArr ^ bytes[i]);
        }
        return xorArr;
    }


    public byte[] getByteArray() throws IOException {
        String filePath = this.path;
        File file = new File(filePath);
        byte[] bytes = new byte[(int) file.length()];

        FileInputStream fis = null;
        try {

            fis = new FileInputStream(file);

            //read file into bytes[]
            fis.read(bytes);

        } finally {
            if (fis != null) {
                fis.close();
            }
        }
        return bytes;
    }
}
