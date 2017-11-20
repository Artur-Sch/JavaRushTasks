package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[10];
        String s;

        for (int i = 0; i < 8; i++) {
            s = scanner.nextLine();
            list[i] = s;
        }

        for (int i = (list.length-1); i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}