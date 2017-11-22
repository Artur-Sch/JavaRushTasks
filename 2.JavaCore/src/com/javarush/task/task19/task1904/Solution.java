package com.javarush.task.task19.task1904;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;
        private Person person;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;

        }

        @Override
        public Person read() throws IOException, ParseException {
            String line = fileScanner.nextLine();
            String[] s = line.split(" ");
            String dates = s[3] + " " + s[4]+ " " + s[5];
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date date = format.parse(dates);
            format.format(date);
            person = new Person(s[1], s[2], s[0], date);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
