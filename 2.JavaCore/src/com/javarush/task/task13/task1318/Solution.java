package com.javarush.task.task13.task1318;

import org.omg.CORBA.portable.InputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inStream = new FileInputStream(s);

        while (inStream.available() > 0) {
            int data = inStream.read();
            char content = (char) data;
            System.out.print(content);
        }
        inStream.close();
        reader.close();
    }
}