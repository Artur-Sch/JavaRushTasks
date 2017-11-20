package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        int min = Integer.MAX_VALUE;
        while (stream.available() > 0) {
            int b = stream.read();
            if (b < min) min = b;
        }
        stream.close();
        reader.close();
        System.out.println(min);
    }
}
