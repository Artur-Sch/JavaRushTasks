package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int resultP = 0;
        int resultN = 0;

        if (a > 0)  resultP++; else if (a < 0) resultN++;
        if (b > 0)  resultP++; else if (b < 0) resultN++;
        if (c > 0)  resultP++; else if (c < 0) resultN++;
        System.out.println("количество отрицательных чисел: " + resultN);
        System.out.println("количество положительных чисел: " + resultP);
    }
}
