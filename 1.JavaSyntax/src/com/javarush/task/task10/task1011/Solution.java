package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        StringBuilder sb = new StringBuilder(s);
        char[] arr = s.toCharArray();
        for (int i = 0; i < 40; i++) {
            System.out.println(sb);
//            if (arr[i+1] == ' ') {
//                arr[i+1] = 0;
//            }
//            arr[i] = 0;
            sb.deleteCharAt(0);
        }

    }

}

