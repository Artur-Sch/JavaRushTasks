package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        String line;
        List<Integer> list = new LinkedList<>();
        while ((line = fileReader.readLine()) != null) {
            list.add(Integer.valueOf(line));
        }
        list.stream().filter(v -> v % 2 == 0).sorted().forEach(System.out::println);
        reader.close();
        fileReader.close();
        //        String fileName = reader.readLine();
//        FileInputStream inStream = new FileInputStream(fileName);
//        ArrayList<Integer> list = new ArrayList<>();
//
//        String line;
//        while (inStream.available() > 0) {
//            int data = inStream.read();
//            char content = (char) data;
//            int t = Integer.valueOf(content);
//            list.add(t);
//        }
//        Collections.sort(list);
//        for (int i = 0; i < list.size();) {
//            if (!(list.get(i) % 2 == 0)) {
//                list.remove(i);
//            }else i++;
//        }
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//        inStream.close();

    }
}
