package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList();
//        int aMin = 0;
//        int aMax = 0;
        int indMin = 0;
        int indMax = 0;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        String min = list.get(0);
        String max = list.get(0);

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < min.length()) {
                min = list.get(i);
//                aMin = min.length();
                indMin = i;
            } else if (list.get(i).length() > max.length()) {
                max = list.get(i);
//                aMax = max.length();
                indMax = i;
            }
        }

        if (indMax > indMin) {
            System.out.println(min);

        } else if (indMax < indMin) {
            System.out.println(max);

        }


//        for(int i = 0; i < 5; i++)
//        {
//            if (list.get(i).length() == aMin && indMin != i) {
//                System.out.println(list.get(i));
//            } else if (list.get(i).length() == aMax && indMax != i) {
//                System.out.println(list.get(i));
//            }
//        }
    }
}

