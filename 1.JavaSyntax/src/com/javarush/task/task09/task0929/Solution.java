package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    private static Exception exception = null;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

//FileNotFoundException
// System.out.println("Файл не существует.");
        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            return new FileInputStream(reader.readLine());
        }
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
