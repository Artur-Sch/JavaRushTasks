package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = reader.readLine()).equals("exit")) {
            ReadThread thread = new ReadThread(s);
            thread.start();
            thread.interrupt();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                InputStream input = new FileInputStream(fileName);
                TreeMap<Byte, Integer> frequencyMap = new TreeMap<>();
                byte[] buf = new byte[input.available()];
                while (input.available() > 0) {
                    input.read(buf);
                }
                for (int i = 0; i < buf.length; i++) {
                    if (frequencyMap.containsKey(buf[i]))
                        frequencyMap.put(buf[i], frequencyMap.get(buf[i]) + 1);
                    else
                        frequencyMap.put(buf[i], 1);
                }
                int maxByte = frequencyMap.firstEntry().getValue();
                byte b = frequencyMap.firstKey();
                for (Map.Entry<Byte, Integer> byteIntegerEntry : frequencyMap.entrySet()) {
                    if (byteIntegerEntry.getValue() > maxByte) {
                        maxByte = byteIntegerEntry.getValue();
                        b = byteIntegerEntry.getKey();
                    }
                }
                resultMap.put(fileName, (int) b);
                input.close();
            } catch (IOException e) {
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
