package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution1 {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {

        String str = "Это стоит 1 бакс, а вот это - 12. Переменная имеет имя file1. 110 - это число.";
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            String result = str;
//            if (str.contains(entry.getKey().toString())) {
//                result = str.replaceAll(entry.getKey().toString(), entry.getValue());
//            }
//            System.out.println(result);
//        }
//





////        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedReader filereader = new BufferedReader(new FileReader(reader.readLine()))) {
////            while (filereader.ready()) {
//        String str = "Это стоит 1 бакс, а вот это - 12. Переменная имеет имя file1. 110 - это число.";
//        String[] s = str.split(" ");
//        ArrayList<String> list = new ArrayList<>();
//        StringBuilder builder = new StringBuilder(str);
//        for (String s1 : s) {
//            list.add(s1);
//        }
//
//
////
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            for (String s1 : list) {
//                if (s1.matches("\\d+.")){
//                    if (s1.equals(entry.getKey().toString())) {
//                        System.out.println(s1+"!!!!!");
//                    }}
//            }
//        }
//
      String q = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            str = str.replaceAll("\\b"+entry.getKey()+"\\b",entry.getValue());
        }
        System.out.println(str);
//
//        for (int i = 0; i < s.length; i++) {
//            String s1 = list.get(i);

//            if (s1.matches("\\d+\\W")) {
//                for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
//                    String[] cell = s1.split("\\W");
//                    if (integerStringEntry.getKey() == Integer.parseInt(cell[0])) {
//                        list.set(i, cell[0].replace(cell[0], integerStringEntry.getValue()));
//                        list.add(i+1, cell[1]);
//                    }
//                }
//            }
//

//            builder.append(s1+ " ");
//        }
//
//        for (String s1 : list) {
//            System.out.print(s1 + " ");
//        }
//////            }
////        }

    }
}
