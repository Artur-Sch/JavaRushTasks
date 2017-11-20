package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigM = new int[20];
        int[] smallM1 = new int[10];
        int[] smallM2 = new int[10];
        int a;
        int g = 10;
        Scanner sc = new Scanner(System.in);

        for (int r = 0; r < bigM.length; r++) {
            a = sc.nextInt();
            bigM[r] = a;
        }

        for (int i = 0; i < 10; i++) {
            smallM1[i] = bigM[i];
        }

        for (int i = 0; i < 10; i++) {
            smallM2[i] = bigM[g];
            g++;
        }

        for (int i : smallM2) {
            System.out.println(i);
        }

    }
}
