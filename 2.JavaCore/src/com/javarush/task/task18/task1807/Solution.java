package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        while (input.available() > 0) {
            int data = input.read();
            list.add(data);
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(44)) {
                count++;
            }
        }

        System.out.print(count);

        reader.close();
        input.close();

    }
}
