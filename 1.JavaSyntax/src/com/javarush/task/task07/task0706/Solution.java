package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] m = new int[15];
        Scanner sc = new Scanner(System.in);
        int a;
        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i < m.length; i++) {
            a = sc.nextInt();
            m[i] = a;
        }
        for (int i = 0; i< m.length ; i++) {
            if (i % 2 == 0) {
                sumL = sumL + m[i];
            } else sumR = sumR + m[i];
        }

        if (sumL > sumR) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
