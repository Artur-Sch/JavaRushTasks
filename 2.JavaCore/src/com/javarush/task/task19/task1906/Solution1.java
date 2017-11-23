package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//             FileReader fileReader = new FileReader(reader.readLine());
//             FileWriter writer = new FileWriter(reader.readLine())) {
//            ArrayList<Integer> bytes = new ArrayList();
//            while (fileReader.ready()) {
//                int data = fileReader.read();
//                bytes.add(data);
//            }
//            for (int i = 2; i < bytes.size(); i=+2) {
//                writer.write(bytes.get(i));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0 ) {
                System.out.println(i);
            }
        }

    }
}
