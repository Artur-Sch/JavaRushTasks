package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b =(-1);
        double sum = 0;
        double sum2;
        while (a != (-1)) {
            sum = sum + a;
            a = scanner.nextInt();
            b++;
        }
        sum2 = sum /b;
        System.out.println(sum2);
    }
}

