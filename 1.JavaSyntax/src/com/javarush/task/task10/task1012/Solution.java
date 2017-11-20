package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }
        // ввод строк

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for (Character ch : alphabet)
        {
            int counter = 0;
            for (String s : list)
            {
                for (int i = 0; i < s.length(); i++) {
                    if (ch == s.toLowerCase().charAt(i))
                        counter++;
                }
            }
            System.out.println(ch + " " + counter);
        }

//        HashMap<Character, Integer> alfa = new HashMap<>();
//        for (Character ch : alphabet) {
//            alfa.put(ch, 0);
//        }
//        for (String s : list) {
//            for (int i = 0; i < s.length(); i++) {
//                if (s.equals(alphabet)) {
//                    alfa.put(s.charAt(i), alfa.get(s.charAt(i)) + 1);
//                }
//            }
//        }
//
//        for (Character character : alphabet) {
//            System.out.println(character + " " + alfa.get(character));
//        }

//        for (String s : list) {
//            char[] st = s.toCharArray();
//            for (Character character : alphabet) {
//                int a =0;
//                for (char c : st) {
//                    if (c == character) {
//                        a++;
//                    }
//                }
//                alfa.put(character, a);
//            }
//        }
//        System.out.println(alfa);
    }

}
