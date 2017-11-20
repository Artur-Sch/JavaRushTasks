package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        ArrayList<Character> vol = new ArrayList<>();
        ArrayList<Character> cons = new ArrayList<>();
        for (char c : arr) {
            if (isVowel(c)) {
                vol.add(c);
            } else if (!isVowel(c) && c !=' ') cons.add(c);
        }
        for (Character character : vol) {
            System.out.print(character + " ");
        }
        System.out.println("");
        for (Character con : cons) {
            System.out.print(con + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}