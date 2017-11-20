package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        String nameFile;
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        @Override
        public void setFileName(String fullFileName) {
            this.nameFile = fullFileName;
        }

        @Override
        public String getFileContent() {
            return sb.toString();
        }

        @Override
        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile)));
                String line;
                while ((line = fileReader.readLine()) != null) {
                    sb.append(line).append(" ");
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //add your code here - добавьте код тут
}
