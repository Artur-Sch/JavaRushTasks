package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        String[] resultz = result.split(" ");
        int a = Integer.parseInt(resultz[0]);
        int b = Integer.parseInt(resultz[2]);
        int c = 0;
        switch (resultz[1]) {
            case "-":
                c = a - b;
                break;
            case "+":
                c = a + b;
                break;
            case "*":
                c = a * b;
                break;
        }
        System.setOut(consoleStream);
        System.out.println(a + " " + resultz[1] + " " + b + " = " + c);
//        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

