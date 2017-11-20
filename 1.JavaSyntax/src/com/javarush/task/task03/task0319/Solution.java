package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String sA = bufferedReader.readLine();
        int a = Integer.parseInt(sA);
        String sB = bufferedReader.readLine();
        int b = Integer.parseInt(sB);

        System.out.println(name + " получает " + a +  " через " + b + " лет.");
    }
}
