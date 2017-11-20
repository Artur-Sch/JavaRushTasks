package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        list.add("asdf");
        list.add("gafbsd");
        list.add("asqwef");
        list.add("asda");
        list.add("asd1234");
        System.out.println(list.size());

        for (Object i : list) {
            System.out.println(i);
        }
    }
}
