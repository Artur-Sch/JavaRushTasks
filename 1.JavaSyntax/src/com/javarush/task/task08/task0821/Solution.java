package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Петов", "Иван");
        map.put("Петов", "Иван");
        map.put("Петов", "Иван");
        map.put("Петов", "Иван");
        map.put("Иванов", "Петр");
        map.put("Иванов", "Петр");
        map.put("Иванов", "Петр");
        map.put("Иванов", "Петр");
        map.put("Иванов", "Иван");
        map.put("Иванов", "Иван");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
