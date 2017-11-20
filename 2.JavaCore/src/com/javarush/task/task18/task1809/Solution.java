package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        FileOutputStream output = new FileOutputStream(reader.readLine());


        while (input.available() > 0) {
            byte[] buffer = new byte[input.available()];
            int count = input.read(buffer);
            for (int i = 0; i < buffer.length / 2; i++) {
                byte tmp = buffer[i];
                buffer[i] = buffer[buffer.length - i - 1];
                buffer[buffer.length - i - 1] = tmp;
            }
            output.write(buffer, 0, count);
        }
        input.close();
        output.close();
    }
}
