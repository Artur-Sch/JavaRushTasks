package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;

import static java.math.BigDecimal.ROUND_HALF_DOWN;
import static java.math.BigDecimal.ROUND_HALF_UP;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Long> integers = new ArrayList<>();
        String s = "3.49 3.50 3.51 -3.49 -3.50 -3.51";
        int result;
        for(String s1: s.split("\\s+")) {
                integers.add(Math.round(Double.parseDouble(s1)));
            System.out.println(s1 + " ");
        }
        for (Long integer : integers) {
            System.out.println(integer);
        }

//        String delimetr = " ";
//        String [] subStr = s.split(delimetr);
//        BigDecimal bd;
//        for (String s1 : subStr) {
//            if (s1.startsWith("-")) {
//                bd = new BigDecimal(Double.parseDouble(s1));
//                integers.add(bd.setScale(0, ROUND_HALF_DOWN)) ;
//            } else {
//                bd = new BigDecimal(Double.parseDouble(s1));
//                integers.add(bd.setScale(0, ROUND_HALF_UP)) ;
//            }
//
//
//        }
//        for (String s1 : subStr) {
//            System.out.println(s1);
//        }
//
//        for (BigDecimal integer : integers) {
//            System.out.println(integer);
//        }

    }
}
