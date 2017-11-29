package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] p = reader.readLine().split(" ");
                String dates = p[p.length-3] + " " + p[p.length-2]+ " " + p[p.length-1];
                SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
                Date date = format.parse(dates);
                format.format(date);
                StringBuilder builder = new StringBuilder();
                String name;
                for (int i = 0; i < p.length - 3; i++) {
                    builder.append(p[i]+" ");
                }
                name = builder.toString().trim();
                PEOPLE.add(new Person(name, date));
            }
        }


    }
}
