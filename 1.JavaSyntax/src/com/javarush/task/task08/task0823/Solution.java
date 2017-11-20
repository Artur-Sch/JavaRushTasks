package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] ch = s.toCharArray();
        for (int j = 1; j < ch.length; j++) {
            ch[0] = Character.toUpperCase(ch[0]);
            if ((ch[j] != ' ') & (ch[j - 1] == ' ')) {
                ch[j] = Character.toUpperCase(ch[j]);
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
    }
}