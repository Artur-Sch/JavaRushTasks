package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (reader.ready()) {
//        String qwe = "а1 abc3d qwer ty6yt mno0 jhgp erttej dfdfg vbbn t5 trtg6 wer7";
                String[] list = reader.readLine().split(" ");
                for (String s : list) {
                    if (s.matches("\\D*?\\d+\\D*?")) {
                        System.out.println(s);
                    }if (!s.matches("^\\D*$")) {
                        System.out.println(s);
                    }
                }
            }
        }
    }
}
