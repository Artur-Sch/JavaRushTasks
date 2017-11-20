package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {

             for (int i = 2; i < 12; i++) {
                 int a = 8;
                 for (int j = 1; j < i; j++) {
                     System.out.print(a);
                 }
                 System.out.println();
            }

    }
}
