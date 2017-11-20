package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner sc = new Scanner(System.in);
        int a;
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {
            a = sc.nextInt();
            mas[i] = a;
        }
        return mas;
    }

    public static int max(int[] array) {
        int m = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }
        return m;
    }
}
