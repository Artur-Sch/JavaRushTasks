package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {
    public static void main(String[] args) {
        String argss = "span";
//        String p = "\\w+";
//        String p = "<" + argss + "\\s?\\r?\\t?.+?>((.+?</" + argss + ">)(.+?<." + argss + ">))?";
        String qq = "((<span\\s?\\r?\\t?.+?>).+?</span>.+?<.span>)|(<span.?\\s?\\r?\\t?\\w+.\\w+<.span>)";
//        String qq = "(?=(<(span)>(?:(?1)|<(?!/2>)|[^<]*+)*+<\\/\\2>))";
//        String r = "(<span.?\\s+?\\r?\\t?>)?(<span.?\\s?\\r?\\t?(\\w+.\\w+)?<.span>)(<.span>)?";
//        String 2r = "(<" + args[0] + ".?\\s?\\r?\\t?\\w+.\\w+<." + args[0] + ">)";
//        String e = "((<span\\s?\\r?\\t?.+?>).+?<\\/span>.+?<.span>)";
//        String 1e = "((<" + args[0] + "\\s?\\r?\\t?.+?>).+?<\\/" + args[0] + ">.+?<." + args[0] + ">)";

        String s = "Info about Leela <span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela</span></b></span><span>Super</span><span>girl</span>";
//        Pattern pattern1 = Pattern.compile(r);
        Pattern pattern2 = Pattern.compile(qq);
//        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
//        int i = 1;
        while (matcher2.find()) {
            System.out.println(s.substring(matcher2.start(), matcher2.end()));
//            System.out.println(matcher2.group().substring(matcher2.start(i)));
//            i++;
        }

//        while (matcher1.find()) {
//            System.out.println(s.substring(matcher1.start(), matcher1.end()));
//        }

    }
}
