package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution1 {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileReader.ready()) {
                list1.add(fileReader.readLine());
            }
            while (fileReader2.ready()) {
                list2.add(fileReader.readLine());
            }
        }
        int a=0;
        if (list1.size() > list2.size()) {
            a = list1.size();
        } else a = list2.size();

        for (int i = 0; i < a ; i++) {
            if (list1.get(i).equals(list2.get(i))) {
                lines.add(new LineItem(Type.SAME, list1.get(i)));
            } else if (!list1.get(i).equals(list2.get(i))&& !list1.get(i).equals(list2.get(i+1))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(i)));
//                list2.add(i, list1.get(i));
            } else if ((!list1.get(i).equals(list2.get(i)) && list1.get(i).equals(list2.get(i + 1))) || (list1.size() - i == 0)) {
                lines.add(new LineItem(Type.ADDED, list2.get(i)));
            }

            if (list1.size() > list2.size()) {
                a = list1.size();
            } else a = list2.size();
        }

    }




    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
