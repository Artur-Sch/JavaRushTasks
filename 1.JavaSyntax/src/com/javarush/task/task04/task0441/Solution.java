package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(b);
            }else System.out.println(c);
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(a);
            }else System.out.println(c);
        } else if (c > b && c > a) {
            if (a > b) {
                System.out.println(a);
            }else System.out.println(b);
        } else if (a == b && a == c) {
            System.out.println(a);
        }
    }
}

