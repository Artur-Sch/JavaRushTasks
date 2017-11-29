package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            StringBuilder builder = new StringBuilder();
            while (reader.ready()) {
                String[] list = reader.readLine().split(" ");
                for (String s : list) {
                    if (s.length() > 6) {
                        builder.append(s + ",");
                    }
                }
            }
            builder = builder.deleteCharAt(builder.length() - 1);
            writer.write(builder.toString());
        }
    }
}
