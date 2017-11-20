package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution2 {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<>();
        ArrayList < String > list2 = new ArrayList<>();
        String s;
        String ls = "";
        int a = 0;
        
        for (int i = 0; i < 5; i++) {
            s = reader.readLine();
            list.add(s);
            if (ls.length() < s.length()) {
                ls = s;
                a = list.indexOf(ls);
            }
        }

        for (int i = 0; i < 5; i++) {
            if (list.get(a).length() == list.get(i).length() && a != i) {
                list2.add(list.get(a));
                list2.add(list.get(i));
            }
        }

        for (String s1 : list2) {
            System.out.println(s1);
        }
    }
}
