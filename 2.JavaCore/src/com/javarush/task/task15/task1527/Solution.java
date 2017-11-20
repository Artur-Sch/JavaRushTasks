//package com.javarush.task.task15.task1527;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
///*
//Парсер реквестов
//*/
//
//public class Solution {
//
//
//    public static void main(String[] args) {
//        //add your code here
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String url = null;
//        try {
//            url = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (url.contains("obj")) {
//            String[] arr = url.split("=");
//            String[] ar2 = arr[1].split("&");
//            System.out.println("obj " + ar2[1]);
//            try {
//                alert(Double.parseDouble(ar2[0]));
//            } catch (Exception e) {
//                alert(ar2[0]);
//            }
//        } else if (url.contains("lvl")) {
//            String[] arr = url.split("=");
//            String[] ar2 = arr[1].split("&");
//            System.out.println("lvl " + ar2[1] + " " + ar2[2]);
//        }
//    }
//
//    public static void alert(double value) {
//        System.out.println("double " + value);
//    }
//
//    public static void alert(String value) {
//        System.out.println("String " + value);
//    }
//}
//*