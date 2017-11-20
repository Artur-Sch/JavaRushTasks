package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone4", new Date("FEBRUARY 15 1980"));
        map.put("Stallone2", new Date("MARCH 21 1980"));
        map.put("Stallone8", new Date("APRIL 22 1980"));
        map.put("Stallone1", new Date("MAY 13 1980"));
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JULY 11 1980"));
        map.put("Stallone9", new Date("AUGUST 25 1980"));
        map.put("Stallone7", new Date("OCTOBER 23 1980"));
        map.put("Stallone6", new Date("DECEMBER 18 1980"));
        map.put("Stallone5", new Date("December 17 1980"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
//        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            HashMap.Entry<String, Date> pair = iterator.next();
//            int i = pair.getValue().getMonth();
//            if (i > 4 && i < 8) {
////                map.remove(iterator.next());
//                map.remove(pair.getKey(), pair.getValue());
//            }
//            System.out.println(pair.getValue().getMonth());
//        }

        ArrayList removelist = new ArrayList();
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            Date date = pair.getValue();
            int m = date.getMonth();
            if (m > 4 && m < 8) {
                removelist.add(pair.getKey());
            }
        }
        for (Object o : removelist) {
            map.remove(o);
        }





//        for (Map.Entry<String, Date> stringDateEntry : map.entrySet()) {
//            if (stringDateEntry.getValue().getMonth() > 4) {
//                map.remove(stringDateEntry.getKey(), stringDateEntry.getValue());
//            }
//            System.out.println(stringDateEntry.getValue().getMonth());
//        }
//        }
//        for (Date date : map.values()) {
//            int month = date.getMonth();
//
////            String dateMonth = date.toString();
////            if (dateMonth.equals("Aug")|| dateMonth.equals("Jun") || dateMonth.equals("May")) {
////                map.remove(date);
////            }
//            System.out.println(date.getMonth());
//        }


    }

    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
         removeAllSummerPeople(map);
//        for (Date date : map.values()) {
//            System.out.println(date);
//        }
    }
}
