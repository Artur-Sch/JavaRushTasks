package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream output1 = new FileOutputStream(reader.readLine());
        FileOutputStream output2 = new FileOutputStream(reader.readLine());

        int file2 = inputStream.available()/2;
        int file1 = inputStream.available() - file2;
        byte[] buffer = new byte[file1];
        byte[] buffer2 = new byte[file2];

        if (inputStream.available() > 0) {
            int count1 = inputStream.read(buffer);
            int count2 = inputStream.read(buffer2);
            output1.write(buffer, 0, count1);
            output2.write(buffer2, 0, count2);
        }

        inputStream.close();
        output1.close();
        output2.close();
    }
}
