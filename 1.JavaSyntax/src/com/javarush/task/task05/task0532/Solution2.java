package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int a;
        int maximum = 0;
        if (n>0) {
            while (n != 0) {
                a = Integer.parseInt(reader.readLine());
                if (a > maximum) {
                    maximum = a;
                    }
             n--;
            }
        }

        System.out.println(maximum);
    }


}

