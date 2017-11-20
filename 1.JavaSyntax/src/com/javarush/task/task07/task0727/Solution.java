package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listdabbleCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
//                s = s + " " + s;
                listdabbleCase.add(s + " " + s);
            } else if (s.length() % 3 != 0 || s.length() != 1) {
//                s = s + " " + s + " " + s;
                listdabbleCase.add(s + " " + s + " " + s);
            }
        }

        for (int i = 0; i < listdabbleCase.size(); i++) {
            System.out.println(listdabbleCase.get(i));
        }
    }
}
