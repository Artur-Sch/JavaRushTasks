package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        reader.close();
        if (input < 0) {
            System.out.println(0);
        } else System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        return String.valueOf(fuck(n));
    }

    public static BigDecimal fuck(int n) {
        BigDecimal ret = null;
        if (n == 0) return BigDecimal.ONE;
        if (n <= 150) {ret = BigDecimal.valueOf(n).multiply(fuck(n - 1));}
        return ret;
    }
}
