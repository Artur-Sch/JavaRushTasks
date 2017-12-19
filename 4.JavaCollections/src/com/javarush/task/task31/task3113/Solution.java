package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.util.Stack;

/* 
Что внутри папки?
*/
public class Solution extends SimpleFileVisitor{

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Path file = Paths.get(reader.readLine());
            if (Files.isRegularFile(file)) {
                System.out.println(file.toAbsolutePath() + " - не папка");
            } else if (Files.isDirectory(file)) {
                long size = 0;
                int dirCount = -1;
                int fileCount = 0;
                Stack<Path> paths = new Stack<>();
                paths.push(file);
                while (!paths.isEmpty()) {
                    Path current = paths.pop();
                    if (Files.isDirectory(current)) {
                        try (DirectoryStream<Path> stream = Files.newDirectoryStream(current)) {
                            for (Path p : stream) {
                                paths.push(p);
                            }
                        }
                        dirCount++;
                    }
                    if (Files.isRegularFile(current)) {
                        size += Files.size(current);
                        fileCount++;
                    }
                }
                System.out.println("Всего папок - " + dirCount);
                System.out.println("Всего файлов - " + fileCount);
                System.out.println("Общий размер - " + size);

            }
        }

    }
}
