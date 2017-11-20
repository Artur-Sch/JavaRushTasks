package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        int min = Integer.MAX_VALUE;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> reslist = new ArrayList<>();

        while (input.available() > 0) {
            int data = input.read();
            list.add(data);
        }

        int[] count = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            count[i] = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] < min) {
                min = count[i];
            }

        }

        for (int i = 0; i < list.size(); i++) {
            if (!reslist.contains(list.get(i)) && count[i] == min) {
                reslist.add(list.get(i));
            }
        }

        for (Integer integer : reslist) {
            System.out.print(integer + " ");
        }
        reader.close();
        input.close();
    }
}

