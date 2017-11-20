package com.javarush.task.task06.task0606;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int b;
        int a = Integer.parseInt(s);

        for (int i = 0; i < s.length(); i++) {
        }


        while (a > 0) {
            b = a % 10;
            if (b % 2 == 0) {
                even++;
            } else odd++;
            a /= 10;
        }
        System.out.println("Even: "+ even + " Odd: " + odd);





    }
}
