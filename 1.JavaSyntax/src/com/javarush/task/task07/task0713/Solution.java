package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> bigList = new ArrayList<>();
        ArrayList<Integer> treeList = new ArrayList<>();
        ArrayList<Integer> twoList = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            bigList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 20; i++) {
            if (bigList.get(i) % 3 == 0) {
                treeList.add(bigList.get(i));
            }
        }
        for (int i = 0; i < 20; i++) {
         if (bigList.get(i) % 2 == 0) {
                twoList.add(bigList.get(i));
            }
        }
        for (int i = 0; i < 20; i++) {
            if (bigList.get(i) % 2 == 0);
                else if (bigList.get(i) % 3 == 0);
                else { otherList.add(bigList.get(i));
            }
        }


        printList(treeList);
        printList(twoList);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
