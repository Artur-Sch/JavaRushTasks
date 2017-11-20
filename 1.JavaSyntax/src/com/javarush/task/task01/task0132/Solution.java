package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int[] a = new int[3];
        for (int i = 2; i >= 0 ; i--) {
            a[i] = number % 10;
            number /= 10;
        }
        return Math.round(a[0]+a[1]+a[2]);
    }
}