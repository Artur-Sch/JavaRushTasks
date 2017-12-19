package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://www.amigo.com/ship/secretPassword.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);
        String fileName = urlString.substring(urlString.lastIndexOf('/')+1);
        Path result =  Paths.get(downloadDirectory + "/" + fileName);
        Path tempFile = Files.createTempFile("tempo-", ".tmp");
        Files.copy(url.openStream(), tempFile);

        Files.move(tempFile, result);
        return result;
    }
}
