package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int a =0;
        while (a != (-1)) {
            a = scanner.nextInt();
            sum = sum +  a;
        }
        System.out.println(sum);
    }
}
