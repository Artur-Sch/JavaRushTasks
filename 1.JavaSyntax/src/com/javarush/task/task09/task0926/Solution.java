package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] l1 = {1, 2, 3, 4, 5};
        list.add(l1);
        int[] l2 = {7, 8};
        list.add(l2);
        int[] l3 = {22, 23, 24, 25};
        list.add(l3);
        int[] l4 = {11, 12, 13, 14, 15, 16, 17};
        list.add(l4);
        int[] l5 = new int[0];
        list.add(l5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
