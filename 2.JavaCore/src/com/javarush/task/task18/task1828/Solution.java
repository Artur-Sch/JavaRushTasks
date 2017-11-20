package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            StringBuilder builder = new StringBuilder();
            ArrayList<String> list = new ArrayList();
            try ( PrintWriter fileWriter = new PrintWriter(fileName);
                 BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName))))
            {
                while (fileReader.ready())
                    list.add(fileReader.readLine());

                switch (args[0]) {
                    case "-u":
                        if (args[1].length() < 8) {
                            args[1] += String.format(String.format("%%%ds", 8 - args[1].length()), " ").replace(" ", " ");
                        }
                        builder.append(args[1]);
                        if (args[2].length() < 30) {
                            args[2] += String.format(String.format("%%%ds", 30 - args[2].length()), " ").replace(" ", " ");
                        }
                        builder.append(args[2]);
                        if (args[3].length() < 8) {
                            args[3] += String.format(String.format("%%%ds", 8 - args[3].length()), " ").replace(" ", " ");
                        }
                        builder.append(args[3]);
                        if (args[4].length() < 4) {
                            args[4] += String.format(String.format("%%%ds", 4 - args[4].length()), " ").replace(" ", " ");
                        }
                        builder.append(args[4]);
                        String element = String.valueOf(builder);
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).startsWith(args[1])) {
                                list.set(i, element);
                            }
                        }
                        break;
                    case "-d":
                        Iterator<String> iter = list.iterator();
                        while (iter.hasNext()) {
                            String product = iter.next();
                            if (product.startsWith(args[1]))
                                iter.remove();
                        }
                        break;
                }
                for (String s : list)
                    fileWriter.println(s);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
