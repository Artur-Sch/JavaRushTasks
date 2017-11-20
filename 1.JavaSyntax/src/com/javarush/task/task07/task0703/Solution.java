package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[10];
        int[] point = new int[10];
        String s;

        for (int i = 0; i < list.length; i++) {
            s = sc.nextLine();
            list[i] = s;
        }


        for (int i = 0; i < point.length; i++) {
            point[i] = list[i].length();
        }
        for (int i : point) {
            System.out.println(i);
        }

    }
}
