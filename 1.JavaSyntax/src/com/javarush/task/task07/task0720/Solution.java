package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int ind = n+m;
        int a= 0;


        for (int i = 0; i < n; i++) {
            list.add((reader.readLine()));
        }

        for (int i = (n); i < ind; i++) {
                list.add(i, list.get(a));
            a++;
        }

        for (int i = 0; i < m;i++) {
            list.remove(0);
        }

//        for (int i = (n-m); i < list.size(); i++) {
//            for (int j = 0; j < m; j++) {
//                list.add(i, list.get(j));
//                list.remove(j);
//            }i++;
//            }


//        for (int i = 0; i < m; i++) {
//            list.remove(i);
//        }


        for (String s : list) {
            System.out.println(s);
        }

        //напишите тут ваш код
    }
}
