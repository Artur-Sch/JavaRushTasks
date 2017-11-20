package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (input.available() > 0) {
            int data = input.read();
            list.add(data);
        }

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }

        for (Integer integer : map.keySet()) {
            System.out.print(integer + " ");
        }

        reader.close();
        input.close();
    }
}
