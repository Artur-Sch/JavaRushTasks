package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        String line;
        List<String> list = new LinkedList<>();
        while ((line = fileReader.readLine()) != null) {
            list.add(line);
        }
        char[] engB = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
        int count = 0;
        for (String s : list) {
            char[] temp =  s.toLowerCase().toCharArray();
            for (char c : temp) {
                for (char c1 : engB) {
                    if (c1 == c) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count++);
        fileReader.close();
    }
}
