package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       int c = 1;
       int d = 1;

        while (c < 11) {
              while (d < 11) {
                  System.out.print(c*d + " ");
                d++;
            }
            d = 1;
             System.out.println();
            c++;
        }


    }
}
