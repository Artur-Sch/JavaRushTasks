package com.javarush.task.task19.task1922;

import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution1 {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("флыат ф фыовтаф пфткпоукп В тарфиура вид");//эту
        list2.add("флыат ф фыовтаф пфткпоукп В тарфиура вид файл");
        list2.add("флыат ф фыовтаф пфткпоукп В тарфиура видф файл");
        list2.add("флыат ф фыовтаф пфткпоукп В тарфиура вид файла");
        list2.add("флыат ф фыовтаф пфткпоукп Вв тарфиура вид вид файла");
        list2.add("флыат ф фыовтаф пфткпоукп Вйцука тарфиура вид");
        list2.add("флыат ф фыовтаф пфткпоукп Вфываф тарфиура видф");
        list2.add("флыат ф фыовтаф пфткпоукп Вфыва тарфиура видыва");
        list2.add("флыат ф фыовтаф пфткпоукп фыаВ тарфиура вид");
        list2.add("флыат ф фыовтаф файл пфткпоукп Вфываф тарфиура вид");//эту
        String s = "флыат ф фыовтаф файл пфткпоукп Вфываф тарфиура вид";//эту

        for (String s1 : list2) {
            for (String word : words) {

            }
        }
//        for (String word : words) {
//            if (s.matches("\\b"+word+"{2}")){
//                System.out.println(s);
//            }
//        }

    }
}
