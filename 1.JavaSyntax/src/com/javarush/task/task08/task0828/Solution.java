package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        SimpleDateFormat dateFormat = null;
        String date1 = s + " 1 1970";
        Date date = new Date(date1);
        dateFormat = new SimpleDateFormat("MMMM" , Locale.ENGLISH);
        System.out.println(dateFormat.format(date) + " is " + (date.getMonth() + 1)+ " month");
        HashMap<String, Integer> map = new HashMap();

    }
}
