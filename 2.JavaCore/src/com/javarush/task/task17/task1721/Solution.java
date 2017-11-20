package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/
public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        String line;
        while ((line = fileReader.readLine()) != null) {
            allLines.add(line);
        }
        fileReader.close();
        BufferedReader fileReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
        while ((line = fileReader2.readLine()) != null) {
            forRemoveLines.add(line);
        }
        fileReader2.close();
        s.joinData();
    }

    public void joinData() throws IOException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
