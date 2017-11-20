package com.javarush.task.task18.task1810;

/* 
DownloadException
*/



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        while (input.available() > 0) {
            if (input.available() >= 1000) {
                byte[] buffer = new byte[input.available()];
                input.read(buffer);
                input = new FileInputStream(reader.readLine());
            } else {
                throw new DownloadException();
            }
        }
        input.close();
    }

    public static class DownloadException extends Exception {

    }
}
