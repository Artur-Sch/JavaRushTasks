package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

public class Solution1 {
    public static void main(String[] args) {
        String s = "qwerq. qwer? qgdfsvg, getgw... qwertqwrg! wervwervwerqt. twerg—werw sdfv bret? eertg r.";
        String s1 = "qwerq. qwer? qgdfsvg, getgw... qwertqwrg! wervwervwerqt. twerg—werw sdfv bret? eertg r.";
//        s = s.replaceAll("[!?,.:;—]", "");
        s = s.replaceAll("\\S\\W", "");
        s1 = s1.replaceAll("\\S\\W", "");
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        builder.append(s1);

//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '.') {
//                chars[i] = '!';
//            }
//            builder.append(chars[i]);
//        }
        System.out.println(builder.toString());
    }
}
