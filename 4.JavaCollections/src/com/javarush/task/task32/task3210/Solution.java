package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        try (RandomAccessFile accessFile = new RandomAccessFile(args[0], "rw")) {
            byte[] bufText = args[2].getBytes();
            byte[] bufFile1 = new byte[bufText.length];
            accessFile.seek(Long.parseLong(args[1]));
            accessFile.read(bufFile1, 0,bufFile1.length);
            String fileText = new String(bufFile1);
            if (fileText.equals(args[2])) {
                accessFile.seek(accessFile.length());
                accessFile.write("true".getBytes());
            } else {
                accessFile.seek(accessFile.length());
                accessFile.write("false".getBytes());
            }

        }
    }
}
