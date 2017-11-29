package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader reader=new BufferedReader(new FileReader(bufferedReader.readLine()))){
            while (reader.ready()) {
                String s = reader.readLine();
                String[] m = s.split("[\\p{P}\\s\\t\\n\\r]");
                int count = 0;
                for (String s1 : m) {
                    for (String word : words) {
                        if (s1.trim().equals(word)) {
                            count++;
                        }
                    }
                }
                if (count == 2) {
                    System.out.println(s);
                }
            }

        }

    }
}
