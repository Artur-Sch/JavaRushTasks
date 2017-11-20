package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        String line;
        List<String> list = new LinkedList<>();
        while ((line = fileReader.readLine()) != null) {
            list.add(line);
        }
        int count = 0;
        int countAll = 0;
        char lett = ' ';
        for (String s : list) {
            char[] temp = s.toCharArray();
            for (char c : temp) {
                countAll++;
                if (c == lett) {
                    count++;
                }
            }
        }

        double result = (double) count/countAll *100;
        System.out.println(String.format(Locale.ENGLISH,"%(.2f", result));
        fileReader.close();
    }
}
