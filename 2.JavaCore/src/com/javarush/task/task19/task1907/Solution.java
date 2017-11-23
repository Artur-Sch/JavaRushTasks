package com.javarush.task.task19.task1907;
/* 
Считаем слово
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            int count = 0;
            while (fileReader.ready()) {
                String[] line = fileReader.readLine().split("world");
                count += (line.length - 1);
            }
            System.out.println(count);
        }
    }
}
