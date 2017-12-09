package com.javarush.task.task20.task2026;

import java.util.Arrays;
import java.util.TreeMap;

/*
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");

    }

    public static int getRectangleCount(byte[][] a) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(Arrays.toString(a[i]), map.size());
        }

        return map.size();
    }
}
