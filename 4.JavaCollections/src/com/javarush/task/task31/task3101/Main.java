package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;

//        String path = "test";
        File file1 = new File("testFile");
        File file2 = new File("test");


        try (Scanner scanner = new Scanner(file2);
             PrintWriter pw = new PrintWriter(file1)) { //этот только записывает текст, не байты и не объекты
            while (scanner.hasNextLine()) {
                pw.println(scanner.nextLine());
            }
        }


    }
}
