package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            while (fileReader.ready()) {
                String[] w = fileReader.readLine().split(" ");
                for (String s : w) {
                    if (s.matches("[-+]?\\d+")) {
                        fileWriter.write(s+ " ");
                    }
                }
            }
        }
    }
}
