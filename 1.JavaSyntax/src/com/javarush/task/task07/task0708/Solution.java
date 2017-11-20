package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        strings = new ArrayList();
        ArrayList<String> list2 = new ArrayList<>();
        String ls = "";
        int a = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > ls.length()) {
                ls = strings.get(i);
                a = i;
            }

        }

        list2.add(strings.get(a));
        for (int i = 0; i < 5; i++) {
            if (strings.get(a).length() == strings.get(i).length() && a != i) {
                list2.add(strings.get(i));
            }
        }

        for (String s1 : list2) {
            System.out.println(s1);
        }
    }
}
