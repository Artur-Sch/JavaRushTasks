package com.javarush.task.task20.task2027;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Кроссворд
*/
public class Solution1 {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
//        detectAllWords(crossword, "home", "same");
        List<Word> result = detectAllWords(crossword, "home", "same", "luf", "poee");
        for (Word word : result) {
            System.out.println(word);
        }

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }


    public static List<Word> detectAllWords(int[][] crossword, String... words) {

        List<Word> result = new ArrayList<>();
        String[] sWords = words;
        char[][] charCrossword = new char[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                charCrossword[i][j] = (char) crossword[i][j];
            }
            System.out.println(Arrays.toString(charCrossword[i]));
        }
        for (String sWord : sWords) {
            point:
            {
                char[] word = sWord.toCharArray();

                for (int i = 0; i < 5; i++) {
                    pointtwo:
                    {
                        for (int j = 0; j < 6; j++) {
                            int wl = sWord.length() - 1;

                            if (word[0] == charCrossword[i][j]) {

                                int x = i;
                                int y = j;
                                for (int k = x - 1; k <= x + 1; k++) {
                                    if (k < 0) {
                                        k=0;
                                    }
                                    for (int l = y - 1; l <= y + 1; l++) {
                                        if (l < 0) {
                                            l=0;
                                        }
                                        if (word[1] == charCrossword[k][l]) {
                                            if (i == k) {
                                                if (l == j - 1) {
                                                    if ((j - wl) >= 0) {
                                                        if (sWord.endsWith(String.valueOf(charCrossword[k][j - wl]))) {
                                                            Word word1 = new Word(String.valueOf(word));
                                                            word1.setStartPoint(j, i);
                                                            word1.setEndPoint(j - (sWord.length() - 1), k);
                                                            result.add(word1);
                                                            break point;
                                                        } else {
                                                            break pointtwo;
                                                        }
                                                    }break pointtwo;
                                                } else if (l == j + 1) {
                                                    if ((j + wl < 6)) {
                                                        if (sWord.endsWith(String.valueOf(charCrossword[k][j + wl]))) {
                                                            Word word1 = new Word(String.valueOf(word));
                                                            word1.setStartPoint(j, i);
                                                            word1.setEndPoint(j + (sWord.length() - 1), k);
                                                            result.add(word1);
                                                            break point;
                                                        } else {
                                                            break pointtwo;
                                                        }
                                                    }break pointtwo;
                                                }
                                            } else if (j == l) {
                                                if (k == i + 1) {
                                                    if ((i + wl < 5)) {
                                                        if (sWord.endsWith(String.valueOf(charCrossword[i + wl][l]))) {
                                                            Word word1 = new Word(String.valueOf(word));
                                                            word1.setStartPoint(j, i);
                                                            word1.setEndPoint(l, i + wl);
                                                            result.add(word1);
                                                            break point;
                                                        } else {
                                                            break pointtwo;
                                                        }
                                                    }break pointtwo;
                                                } else if (k == i - 1) {
                                                    if (i - wl >= 0) {
                                                        if (sWord.endsWith(String.valueOf(charCrossword[i - wl][l]))) {
                                                            Word word1 = new Word(String.valueOf(word));
                                                            word1.setStartPoint(j, i);
                                                            word1.setEndPoint(l, i - wl);
                                                            result.add(word1);
                                                            break point;
                                                        } else {
                                                            break pointtwo;
                                                        }
                                                    }break pointtwo;
                                                }
                                            } else {
                                                if (k == i - 1 && l == j - 1) {
                                                    if (sWord.endsWith(String.valueOf(charCrossword[i - wl][j - wl])) && (i - wl >= 0 && j - wl >= 0)) {
                                                        Word word1 = new Word(String.valueOf(word));
                                                        word1.setStartPoint(j, i);
                                                        word1.setEndPoint(j - wl, i - wl);
                                                        result.add(word1);
                                                        break point;
                                                    } else {
                                                        break pointtwo;
                                                    }
                                                } else if (k == i + 1 && l == j - 1) {
                                                    if ((i + wl < 5 && j - wl >= 0)) {
                                                        if (sWord.endsWith(String.valueOf(charCrossword[i + wl][j - wl]))) {
                                                            Word word1 = new Word(String.valueOf(word));
                                                            word1.setStartPoint(j, i);
                                                            word1.setEndPoint(j - (sWord.length() - 1), i + (sWord.length() - 1));
                                                            result.add(word1);
                                                            break point;
                                                        }else break pointtwo;
                                                    }else break pointtwo;

                                                } else if (k == i + 1 && l == j + 1) {
                                                    if ((i + wl < 5 && j + wl < 6)) {
                                                        if (sWord.endsWith(String.valueOf(charCrossword[i + wl][j + wl]))) {
                                                            Word word1 = new Word(String.valueOf(word));
                                                            word1.setStartPoint(j, i);
                                                            word1.setEndPoint(j + (sWord.length() - 1), i + (sWord.length() - 1));
                                                            result.add(word1);
                                                            break point;
                                                        }else break pointtwo;
                                                    }else break pointtwo;
                                                } else if (k == i - 1 && l == j + 1) {
                                                    if ((i - wl >= 0 && j + wl < 6)) {
                                                        if (sWord.endsWith(String.valueOf(charCrossword[i - wl][j + wl]))) {
                                                            Word word1 = new Word(String.valueOf(word));
                                                            word1.setStartPoint(j, i);
                                                            word1.setEndPoint(j + (sWord.length() - 1), i - (sWord.length() - 1));
                                                            result.add(word1);
                                                            break point;
                                                        }else break pointtwo;
                                                    }else break pointtwo;
                                                }
                                            }
                                        } else if (word[1] != charCrossword[k][l] && k==x+1 && l==y+1) {
                                            break pointtwo;
                                        }
                                    }
                                }
                            }
                        }
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
