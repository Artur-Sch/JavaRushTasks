package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = reader.readLine();
            if ((s).equals("sun")) {
                thePlanet = Sun.getInstance();
            } else if ((s).equals("moon")) {
                thePlanet = Moon.getInstance();
            }else if ((s).equals("earth")) {
                thePlanet = Earth.getInstance();
            } else thePlanet = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(thePlanet);
        // implement step #5 here - реализуйте задание №5 тут
    }
}
