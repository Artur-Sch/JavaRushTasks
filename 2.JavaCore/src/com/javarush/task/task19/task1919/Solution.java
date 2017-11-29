package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] s = reader.readLine().split(" ");
                double tmp = 0;
                if (map.containsKey(s[0])) {
                    tmp = map.get(s[0]) + Double.parseDouble(s[1]);
                    map.replace(s[0], map.get(s[0]), tmp);
                } else {
                    map.put(s[0], Double.parseDouble(s[1]));
                }
            }
        }
        for (Map.Entry<String, Double> doubleEntry : map.entrySet()) {
            System.out.println(doubleEntry.getKey() + " " + doubleEntry.getValue());
        }
    }
}
