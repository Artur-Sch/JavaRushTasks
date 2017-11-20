package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {

        if (args[0].startsWith("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder builder = new StringBuilder();
            String fileName = reader.readLine();
            try (OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream(fileName, true));
                 BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
                String line;
                int id = 0;
                while ((line = fileReader.readLine()) != null) {
                    id = Integer.parseInt(line.substring(0, 8).trim());
                }
                id++;
                String s1 = String.valueOf(id);
                if (String.valueOf(id).length() < 8) {
                    s1 += String.format(String.format("%%%ds", 8 - String.valueOf(id).length()), " ").replace(" ", " ");
                }
                builder.append(s1);
                if (args[1].length() < 30) {
                    args[1] += String.format(String.format("%%%ds", 30 - args[1].length()), " ").replace(" ", " ");
                }
                builder.append(args[1]);
                if (args[2].length() < 8) {
                    args[2] += String.format(String.format("%%%ds", 8 - args[2].length()), " ").replace(" ", " ");
                }
                builder.append(args[2]);
                if (args[3].length() < 4) {
                    args[3] += String.format(String.format("%%%ds", 4 - args[3].length()), " ").replace(" ", " ");
                }
                builder.append(args[3]);
                output.write(String.valueOf(builder));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
