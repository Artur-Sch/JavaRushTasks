package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList();
        try {
            while (true) {
                list.add(scanner.nextInt());
            }
        } catch (Exception exception) {
            for (Object o : list) {
                System.out.println(o);
            }
        }

    }
}
