package com.javarush.task.task18.task1825;


/* 
Собираем файл
*/

import java.io.*;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader fileReader = null;

        TreeSet<String> set = new TreeSet<>();


        String s;
        String[] s2 = null;
        while (!(s = reader.readLine()).equals("end")) {
            set.add(s);
            s2 = s.split(".part");
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(s2[0])));
        for (String s1 : set) {
            try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(s1)))){
            String line;
            while ((line = fileReader.readLine()) != null) {
                writer.write(line);
            }
        }}
        reader.close();
        writer.close();
    }
}
