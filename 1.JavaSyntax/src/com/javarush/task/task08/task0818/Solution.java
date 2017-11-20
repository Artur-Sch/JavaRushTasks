package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> personal = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            personal.put("Фамилия" + i, (460 + (i * 7)));
        }
        return personal;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        ArrayList<String> personalDelete = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 500) {
                personalDelete.add(entry.getKey());
            }
        }
        for (String s : personalDelete) {
            map.remove(s);
        }

    }

    public static void main(String[] args) {

    }
}