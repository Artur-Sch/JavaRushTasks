package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Проход по дереву файлов
*/
public class Solution1 {
    private static ArrayList<File> resultList = new ArrayList<>();

    private static void deleteFile(String path) {
        for (File file : new File(path).listFiles()) {
            if (file.isDirectory()) {
                deleteFile(file.getAbsolutePath());
                continue;
            }
            if (file.length() > 50) {
                FileUtils.deleteFile(file);
            } else {
                resultList.add(file);
            }
        }
}


    public static void main(String[] args) throws IOException {

        deleteFile(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        Collections.sort(resultList, new LengthComparator());

        try (FileOutputStream outputStream = new FileOutputStream(allFilesContent);) {
            for (File file : resultList) {
                FileInputStream inputStream = new FileInputStream(file);
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read());
                }
                outputStream.write(System.lineSeparator().getBytes());
                outputStream.flush();
                inputStream.close();
            }
        }


    }

    private static class LengthComparator implements Comparator<File> {
        @Override
        public int compare(File o1, File o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

}
