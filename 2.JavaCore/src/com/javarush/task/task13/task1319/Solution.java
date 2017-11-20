package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile));
            String s;
//             writer.write(s + "\r\n");
//             writer.flush();

        do {
            s = reader.readLine();
            writer.write(s + "\n");
            writer.flush();
        } while (!(s).equals("exit"));


//        while (!(s).equals("exit")) {
//            writer.write(s + "\r\n");
//            writer.flush();
//        }
        writer.close();
    }
}
