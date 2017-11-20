package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

import java.util.ArrayList;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                list.add(i);
            }
        }

        for (Integer integer : list) {
            int k = integer;
            int x = k;
            int s = 0;
            while (x != 0) {
                s += x % 10;
                x /= 10;
            }
            if (s < 10) {
                System.out.println("i = " + integer + ", s = " + s);
            }
        }

    }
}
