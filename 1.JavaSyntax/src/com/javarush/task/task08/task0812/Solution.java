package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int mem = 0;
        int a = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) == list.get(a)) {
                count++;
            } else count = 1;
            if (count > mem) {
                mem = count;
            }
            a++;
        }
        System.out.println(mem);
    }
}