package com.javarush.task.task19.task1924;

public class Main {
    public static void main(String[] args) {
        String str = "Это стоит 1 бакс, а вот это - 12. Переменная имеет имя file1. 110 - это число.";
        if (str.contains("1")) {
           String s =  str.replace("1", "один");
        }
        System.out.println(str);



    }
}
