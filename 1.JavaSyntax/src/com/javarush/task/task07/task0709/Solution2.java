package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList();
        int a = 0;
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        String ls = list.get(0);
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() < ls.length()) {
                ls = list.get(i);
                a = i;
            }
        }

        list2.add(list.get(a));
        for (int i = 0; i < 5; i++) {
            if (list.get(a).length() == list.get(i).length() && a != i) {
                list2.add(list.get(i));
            }
        }

        for (String s9 : list2) {
            System.out.println(s9);
        }
    }
}
