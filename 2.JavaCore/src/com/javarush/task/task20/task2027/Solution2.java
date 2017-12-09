package com.javarush.task.task20.task2027;


import java.util.ArrayList;
import java.util.List;

/*
Кроссворд
*/
public class Solution2 {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
//        detectAllWords(crossword, "home", "same");
        List<Word> result = detectAllWords(crossword, "home", "same", "luf", "poee", "rrad");
        for (Word word : result) {
            System.out.println(word);
        }

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static Word up(int[][] crossword, int startX, int startY, String s) {
        int x = startX;
        int y = startY - 1;
        for (int i = 1; i < s.length(); i++) {
            if (y < 0)
                return null;

            if ((char) crossword[y][x] != s.charAt(i))
                return null;
            y--;
        }
        Word w = new Word(s);
        w.setStartPoint(startX, startY);
        w.setEndPoint(x, y + 1);
        return w;
    }

    public static Word upLeft(int[][] crossword, int startX, int startY, String s) {
        int x = startX - 1;
        int y = startY - 1;
        for (int i = 1; i < s.length(); i++) {
            if (x < 0 || y < 0)
                return null;

            if ((char) crossword[y][x] != s.charAt(i))
                return null;
            x--;
            y--;
        }
        Word w = new Word(s);
        w.setStartPoint(startX, startY);
        w.setEndPoint(x + 1, y + 1);
        return w;
    }

    public static Word upRight(int[][] crossword, int startX, int startY, String s) {
        int x = startX + 1;
        int y = startY - 1;
        for (int i = 1; i < s.length(); i++) {
            if (x >= crossword[0].length || y < 0)
                return null;

            if ((char) crossword[y][x] != s.charAt(i))
                return null;
            x++;
            y--;
        }
        Word w = new Word(s);
        w.setStartPoint(startX, startY);
        w.setEndPoint(x - 1, y + 1);
        return w;
    }

    public static Word down(int[][] crossword, int startX, int startY, String s) {
        int x = startX;
        int y = startY + 1;
        for (int i = 1; i < s.length(); i++) {
            if (y >= crossword.length)
                return null;

            if ((char) crossword[y][x] != s.charAt(i))
                return null;
            y++;
        }
        Word w = new Word(s);
        w.setStartPoint(startX, startY);
        w.setEndPoint(x, y - 1);
        return w;
    }

    public static Word downLeft(int[][] crossword, int startX, int startY, String s) {
        int x = startX + 1;
        int y = startY + 1;
        for (int i = 1; i < s.length(); i++) {
            if (x >= crossword[0].length || y >= crossword.length)
                return null;

            if ((char) crossword[y][x] != s.charAt(i))
                return null;
            x++;
            y++;
        }
        Word w = new Word(s);
        w.setStartPoint(startX, startY);
        w.setEndPoint(x - 1, y - 1);
        return w;
    }

    public static Word downRight(int[][] crossword, int startX, int startY, String s) {
        int x = startX - 1;
        int y = startY + 1;
        for (int i = 1; i < s.length(); i++) {
            if (x < 0 || y >= crossword.length)
                return null;

            if ((char) crossword[y][x] != s.charAt(i))
                return null;
            x--;
            y++;
        }
        Word w = new Word(s);
        w.setStartPoint(startX, startY);
        w.setEndPoint(x + 1, y - 1);
        return w;
    }

    public static Word right(int[][] crossword, int startX, int startY, String s) {
        int x = startX - 1;
        int y = startY;
        for (int i = 1; i < s.length(); i++) {
            if (x < 0 || y >= crossword[0].length)
                return null;

            if ((char) crossword[y][x] != s.charAt(i))
                return null;
            x--;
        }
        Word w = new Word(s);
        w.setStartPoint(startX, startY);
        w.setEndPoint(x + 1, y);
        return w;
    }

    public static Word left(int[][] crossword, int startX, int startY, String s) {
        int x = startX + 1;
        int y = startY;
        for (int i = 1; i < s.length(); i++) {
            if (x >= crossword[0].length)
                return null;

            if ((char) crossword[y][x] != s.charAt(i))
                return null;
            x++;
        }
        Word w = new Word(s);
        w.setStartPoint(startX, startY);
        w.setEndPoint(x - 1, y);
        return w;
    }


    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        ArrayList<Word> result = new ArrayList<>();

        for (String word : words) {
            char latter = word.charAt(0);

            //Search first latter in the crossword
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {

                    if ((char) crossword[i][j] == latter) { //ok, first latter from word has been finded.
                        int startX = j;
                        int startY = i;

                        Word[] trend = new Word[8];
                        trend[0] = up(crossword, startX, startY, word);
                        trend[1] = upLeft(crossword, startX, startY, word);
                        trend[2] = upRight(crossword, startX, startY, word);
                        trend[3] = down(crossword, startX, startY, word);
                        trend[4] = downLeft(crossword, startX, startY, word);
                        trend[5] = downRight(crossword, startX, startY, word);
                        trend[6] = left(crossword, startX, startY, word);
                        trend[7] = right(crossword, startX, startY, word);


                        for (int ii = 0; ii < trend.length; ii++)
                            if (trend[ii] != null)
                                result.add(trend[ii]);
                    }
                }
            }
        }
        return result;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
