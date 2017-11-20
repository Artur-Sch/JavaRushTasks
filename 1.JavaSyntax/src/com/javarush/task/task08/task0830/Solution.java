package com.javarush.task.task08.task0830;



import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
//        сортировка по алфавиту
        String tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1+i; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    //Метод для сравнения строк: 'а'[i] больше чем 'b'[j]
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
//        Arrays.sort(array); алтернатива
    }


    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
