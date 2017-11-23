package com.javarush.task.task19.task1907;
/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws IOException {

      try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
        int count = 0;
        while (fileReader.ready()) {
            String[] words =  fileReader.readLine().split("\\W");
            for (String s : words)
                if (s.equals("world"))
                    count++;
        }
        System.out.println(count);
      }
    }
}
