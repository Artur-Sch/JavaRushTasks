package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = 0;
        int i2 = 0;


        try {
            i1 = Integer.parseInt(reader.readLine());
            if (i1 <= 0)
                throw new NumberFormatException();
            i2 = Integer.parseInt(reader.readLine());
            if (i2 <= 0)
                throw new NumberFormatException();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(FunctionGcd(i1, i2));
    }
    static long FunctionGcd(long a, long b){
        return b == 0 ? a : FunctionGcd(b, a%b);
    }
}
