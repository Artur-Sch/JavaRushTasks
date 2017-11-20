package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int a = Integer.parseInt(s);

        if (1 <= a && a <= 999) {
            if (s.length() == 1) {
                if (a % 2 == 0) {
                    System.out.println("четное однозначное число");
                } else System.out.println("нечетное однозначное число");
            } else if (s.length() == 2) {
                if (a % 2 == 0) {
                    System.out.println("четное двузначное число");
                } else System.out.println("нечетное двузначное число");
            } else if (s.length() == 3) {
                if (a % 2 == 0) {
                    System.out.println("четное трехзначное число");
                } else System.out.println("нечетное трехзначное число");
            }
        }


    }
}
