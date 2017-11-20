package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tm = new int[5];
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(reader.readLine());
            tm[i] = a;
        }
        Arrays.sort(tm);
        for (int i : tm) {
            System.out.println(i);
        }
        //напишите тут ваш код
    }
}
