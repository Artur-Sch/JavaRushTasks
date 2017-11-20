package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> set1 = new HashSet();
        set1.add("арбуз");
        set1.add("банан");
        set1.add("вишня");
        set1.add("груша");
        set1.add("дыня");
        set1.add("ежевика");
        set1.add("жень-шень");
        set1.add("земляника");
        set1.add("ирис");
        set1.add("картофель");

        for (String plant : set1) {
            System.out.println(plant);
        }
    }
}
