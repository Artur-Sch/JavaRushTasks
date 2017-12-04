package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties propert = new Properties();
    public static String nameFile;

    public void fillInPropertiesMap() throws Exception {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        nameFile = nameReader.readLine();
        nameReader.close();

        FileInputStream inputStream = new FileInputStream(nameFile);

        load(inputStream);
        inputStream.close();

        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        propert.clear();
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            propert.put(entry.getKey(), entry.getValue());
        }

        propert.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        propert.load(inputStream);
        for (Map.Entry<Object, Object> entry : propert.entrySet()) {
            properties.put((String) entry.getKey(), (String) entry.getValue());
        }


    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();

        FileOutputStream fileOutputStream = new FileOutputStream(nameFile);
        solution.save(fileOutputStream);
        fileOutputStream.close();
    }
}
