package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        list of addresses
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String country = reader.readLine();
            if (country.isEmpty()) break;
            String family = reader.readLine();
            map.put(country, family);
        }
        //read home number
        String s = reader.readLine();
        String family= "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(s)) {
                family = entry.getValue();
            }
        }
        System.out.println(family);
    }
}
