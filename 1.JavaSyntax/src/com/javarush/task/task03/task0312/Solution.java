package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(20));
        System.out.println(convertToSeconds(50));

    }
    public static int convertToSeconds(int hour){
        int second = hour*60*60;
        return second;
    }
}
