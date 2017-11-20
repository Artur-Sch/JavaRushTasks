package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] m = new int[10];
        int a;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            a = sc.nextInt();
            m[i] = a;
        }
        for (int i = (m.length-1); i >= 0; i--) {
            System.out.println(m[i]);

        }
    }
}

