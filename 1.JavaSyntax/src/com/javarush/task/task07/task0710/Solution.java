package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        String s5 = reader.readLine();
        String s6 = reader.readLine();
        String s7 = reader.readLine();
        String s8 = reader.readLine();
        String s9 = reader.readLine();
        String s10 = reader.readLine();
        list.add(s10);
        list.add(s9);
        list.add(s8);
        list.add(s7);
        list.add(s6);
        list.add(s5);
        list.add(s4);
        list.add(s3);
        list.add(s2);
        list.add(s1);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
