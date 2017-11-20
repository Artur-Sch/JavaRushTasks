package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> contacts = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            contacts.put("lastName" + i, "name" + 1);
        }
        return contacts;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {


//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            removeItemFromMapByValue(map, entry.getValue());
//        }

        Set<String> set = new HashSet<>();
//        Iterator<String> iterator = map.values().iterator();
        ArrayList<String> list = new ArrayList();
        for (String s : map.values()) {
            String s1;
            if (!set.add(s)) {
                s1 = s;
                list.add(s1);
            }
        }
        for (String o : list) {
            removeItemFromMapByValue(map, o);
        }


//
//         Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            HashMap.Entry<String,String> pair = iterator.next();
//            if (pair.getValue().equals(iterator.next().getValue())) {
//                removeItemFromMapByValue(map, pair.getValue());
//            }
//        }


//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            if (pair.getValue().equals())
//        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
