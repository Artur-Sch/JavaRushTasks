package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 2 2013"));

    }
    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        int dayCount = Integer.parseInt(dateFormat.format(date1));
        boolean result;
        if (dayCount % 2 == 0) {
            result = false;
        } else result = true;
        return result;
    }
}
