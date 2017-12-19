package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileInputStream inputStream2 = new FileInputStream(fileName2);
        FileOutputStream outputStream = new FileOutputStream(fileName1);
        byte[] buffer1 = new byte[inputStream1.available()];
        if (inputStream1.available() > 0) {
            inputStream1.read(buffer1);
        }
        byte[] buffer2 = new byte[inputStream2.available()];
        if (inputStream2.available() > 0) {
            int count = inputStream2.read(buffer2);
            outputStream.write(buffer2,0,count);
            outputStream.write(buffer1);

        }
        inputStream1.close();
        inputStream2.close();
        outputStream.close();
    }
}
