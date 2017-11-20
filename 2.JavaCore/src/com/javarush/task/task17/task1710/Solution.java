package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();


    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        if (args[0].startsWith("-c")) {
            Date date = null;
            Date date2 = null;
            try {
                date = dateFormat.parse(args[3]);
                date2 = dateFormat.parse(args[6]);
            } catch (ParseException e) {
                e.getMessage();
            }
            if (args[2].startsWith("м")) {
                Person person = Person.createMale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            } else {
                Person person = Person.createFemale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
            if (args[4].startsWith("м")) {
                Person person2 = Person.createMale(args[4], date2);
                allPeople.add(person2);
                System.out.println(allPeople.indexOf(person2));
            } else {
                Person person2 = Person.createFemale(args[4], date);
                allPeople.add(person2);
                System.out.println(allPeople.indexOf(person2));
            }
        }

        if (args[0].startsWith("-u")) {
            int index = Integer.parseInt(args[1]);
            int index2 = Integer.parseInt(args[5]);
            Person person = allPeople.get(index);
            Person person2 = allPeople.get(index2);
            person.setName(args[2]);
            person2.setName(args[6]);
            Date date = null;
            Date date2 = null;
            try {
                date = dateFormat.parse(args[4]);
                date2 = dateFormat.parse(args[8]);
            } catch (ParseException e) {
                e.getMessage();
            }
            person.setBirthDay(date);
            person2.setBirthDay(date2);
            if (args[3].startsWith("м"))
                person.setSex(Sex.MALE);
            else
                person.setSex(Sex.FEMALE);
            if (args[7].startsWith("м"))
                person.setSex(Sex.MALE);
            else
                person.setSex(Sex.FEMALE);
        }

        if (args[0].startsWith("-d")) {
            for (int i = 1; i < args.length; i++) {
                int index = Integer.parseInt(args[i]);
                Person person = allPeople.get(index);
                person.setName(null);
                person.setSex(null);
                person.setBirthDay(null);
            }



        }

        if (args[0].startsWith("-i")) {
            for (int i = 1; i < args.length; i++) {
                int index = Integer.parseInt(args[i]);
                Person person = allPeople.get(index);
                StringBuffer s = new StringBuffer();
                s.append(person.getName());
                s.append(" ");
                s.append(person.getSex() == Sex.MALE ? "м" : "ж");
                s.append(" ");
                s.append(dateFormatPrt.format(person.getBirthDay()));
                System.out.println(s);
            }
        }

    }
}