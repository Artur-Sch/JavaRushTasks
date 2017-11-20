package com.javarush.task.task07.task0717;

import sun.java2d.pipe.AATextRenderer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> bigList = new ArrayList<>(20);
        list1 = list;
        bigList.addAll(list);
        bigList.addAll(list1);
        int a= 0;
        for (int i = 0; i < bigList.size(); i++) {
            bigList.set(i, list.get(a));
            bigList.set((i+1), list.get(a));
            i++;
            a++;
        }
        return bigList;
    }
}
