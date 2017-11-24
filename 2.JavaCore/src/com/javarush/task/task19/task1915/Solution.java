package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream writer = new FileOutputStream(reader.readLine())) {
            PrintStream consoleStream = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream);
            System.setOut(stream);
            testString.printSomething();
            System.setOut(consoleStream);
            outputStream.writeTo(writer);
            System.out.println(outputStream.toString());
//            String result = outputStream.toString();
//            byte[] results = result.getBytes();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

