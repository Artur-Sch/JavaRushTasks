package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        //-e, -d - args[0];
        //filename - args[1];
        //fileOutputName - args[2];

        //зашифровать
        try (FileInputStream input = new FileInputStream(args[1]);
             FileOutputStream output = new FileOutputStream(args[2])) {
            ArrayList<Integer> list = new ArrayList();
            if (args[0].equals("-e")) {
                while (input.available() > 0) {
                    list.add(input.read());
                }
                Collections.reverse(list);
                for (Integer integer : list) {
                    output.flush();
                    output.write(integer);
                }
            } else if (args[0].equals("-d")) {
                while (input.available() > 0) {
                    list.add(input.read());
                }
                Collections.reverse(list);
                for (Integer integer : list) {
                    output.write(integer);
                }
            }
        }
    }

}
