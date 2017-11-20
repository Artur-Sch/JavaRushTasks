package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.math.BigDecimal.ROUND_HALF_DOWN;
import static java.math.BigDecimal.ROUND_HALF_UP;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reader.readLine())));
        String line;
        List<String> list = new LinkedList<>();
        ArrayList<BigDecimal> integers = new ArrayList<>();

        while ((line = fileReader1.readLine()) != null) {
            list.add(line);
        }
        for (String s : list) {
            String delimetr = " ";
            String [] subStr = s.split(delimetr);
            BigDecimal bd;
            for (String s1 : subStr) {
                if (s1.startsWith("-")) {
                    bd = new BigDecimal(Double.parseDouble(s1));
                    integers.add(bd.setScale(0, ROUND_HALF_DOWN)) ;
                } else {
                    bd = new BigDecimal(Double.parseDouble(s1));
                    integers.add(bd.setScale(0, ROUND_HALF_UP)) ;
                }
            }
        }

        for (BigDecimal integer : integers) {
            writer.write(integer.intValue() + " ");
        }
        fileReader1.close();
        writer.close();
    }

}
