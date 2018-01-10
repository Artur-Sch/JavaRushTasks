package com.javarush.task.task32.task3201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
        try (RandomAccessFile accessFile = new RandomAccessFile(args[0], "rw")) {
            if (accessFile.length() < Long.parseLong(args[1])) {
                accessFile.seek(accessFile.length());
                byte[] buffer = args[2].getBytes();
                accessFile.write(buffer);
            } else {
                accessFile.seek(Long.parseLong(args[1]));
                byte[] buffer = args[2].getBytes();
                accessFile.write(buffer);
            }
        }
    }
}
