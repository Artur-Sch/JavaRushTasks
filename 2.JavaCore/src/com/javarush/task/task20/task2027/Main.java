package com.javarush.task.task20.task2027;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File tempFile = File.createTempFile("tempFile", null);
        try (FileReader reader = new FileReader(tempFile);
             FileWriter writer = new FileWriter(tempFile)) {

//            String string = new String();
//            writer.write(string);
            while (reader.ready()) {
                System.out.println(reader.read());
            }
        }
    }
}