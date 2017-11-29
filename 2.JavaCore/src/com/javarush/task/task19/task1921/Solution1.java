package com.javarush.task.task19.task1921;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution1 {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws ParseException {

        String s = "Анна Надежда 15 5 2013";
        String[] p = s.split(" ");
        int d = Integer.parseInt(p[p.length-3]);
        int m = Integer.parseInt(p[p.length-2]);
        int y = Integer.parseInt(p[p.length-1]);
        StringBuilder builder = new StringBuilder();
        String dates = p[p.length-3] + " " + p[p.length-2]+ " " + p[p.length-1];
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        Date date = format.parse(dates);
//        Date date1 = Date.parse(dates);
        format.format(date);
        String name;
        if ((p.length - 3) > 1) {
            for (int i = 0; i < p.length - 3; i++) {
                builder.append(p[i] + " ");
            }
        } else builder.append(p[0]);

        name = builder.toString().trim();
        PEOPLE.add(new Person(name, date));
        System.out.println(name.trim());
    }
}
