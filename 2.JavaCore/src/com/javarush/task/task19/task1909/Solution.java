package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            while (fileReader.ready()) {
                char[] chars = fileReader.readLine().toCharArray();
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == '.') {
                        chars[i] = '!';
                    }
                    builder.append(chars[i]);
                }
                fileWriter.write(builder.toString());
            }
        }
    }
}
