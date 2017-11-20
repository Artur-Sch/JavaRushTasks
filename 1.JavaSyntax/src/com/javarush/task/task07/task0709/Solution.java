package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList <String> list = new ArrayList();
        int a = 0;
        int ind = 0;

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        String ls = list.get(0);
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() < ls.length()) {
                ls = list.get(i);
                a = ls.length();
                ind = i;
            }
        }
        System.out.println(ls);
        for(int i = 0; i < 5; i++)
        {
            if (list.get(i).length() == a && ind != i) {
                System.out.println(list.get(i));
            }
          }
    }
}
