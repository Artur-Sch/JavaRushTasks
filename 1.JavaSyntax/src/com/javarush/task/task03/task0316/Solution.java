package com.javarush.task.task03.task0316;

/* 
Экранирование символов
*/

public class Solution {
    public static void main(String[] args) {
        String p = "\"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String s = "\\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
        System.out.println("It's Windows path: " + p);
        System.out.println("It's Java string: " + s);
    }
}
