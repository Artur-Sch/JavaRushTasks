package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = 0;

        if (a > 0)  result++;
        if (b > 0)  result++;
        if (c > 0)  result++;
        System.out.println(result);


    }
}
