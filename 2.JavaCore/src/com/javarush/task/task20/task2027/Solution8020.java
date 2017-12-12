package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution8020 {
    public static void main(String[] args) throws Exception{
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'p', 's', 'a', 'm', 'e', 'o'},
                {'l', 'a', 'g', 'v', 'l', 'p'},
                {'m', 'm', 'p', 'r', 'p', 'h'},
                {'p', 'e', 'm', 'o', 'h', 'v'}
        };
        for(Word w: detectAllWords(crossword, "home", "same", "plv")) System.out.println(w.toString());
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }
    public static String findWord(String str, String word){
        return null;
    }
    public static List<Word> detectAllWords(int[][] crossword, String... words) throws Exception{
        List<Word> result=new ArrayList<>();
        List<int[][]> buf=new ArrayList<>();
        String hline="";
        String vline="";
        String hvline="";

        for(String w:words){ // argument words

        // 3 cycles brute words both ways ??? MANY
            for(int i=0;i<crossword.length;i++){ // lines parse
                byte[][] gg=new byte[3][crossword[i].length];
                for(int j=0;j<crossword[i].length;j++){
                    gg[0][j]=(byte)crossword[i][j];
                    gg[1][j]=(byte)i;
                    gg[2][j]=(byte)j;
                }
                String line=new String(gg[0]);
                if(line.contains(w)){
                    Word word=new Word(w);
                    word.setStartPoint(gg[2][line.indexOf(w)], gg[1][line.indexOf(w)]);
                    word.setEndPoint(gg[2][line.indexOf(w)+w.length()-1], gg[1][line.indexOf(w)+w.length()-1]);
                    result.add(word);}
                if(new StringBuilder(line).reverse().toString().contains(w)){
                    String reversed=new StringBuilder(line).reverse().toString();
                    Word word=new Word(w);
                    word.setStartPoint(gg[1][reversed.indexOf(w)], gg[2][reversed.length()-1-reversed.indexOf(w)]);
                    word.setEndPoint(gg[2][reversed.length()-reversed.indexOf(w)-w.length()],gg[1][reversed.length()-reversed.indexOf(w)-w.length()+1]);
                    result.add(word);
                }
            }
            for(int j=0;j<crossword[0].length;j++){//rows parse
                byte[][] gg=new byte[3][crossword.length];
                for(int i=0;i<crossword.length;i++){
                    gg[0][i]=(byte)crossword[i][j];
                    gg[1][i]=(byte)i;
                    gg[2][i]=(byte)j;
                }
                String line=new String(gg[0]);
                if(line.contains(w)){
                    Word word=new Word(w);
                    word.setStartPoint(gg[2][line.indexOf(w)], gg[1][line.indexOf(w)]);
                    word.setEndPoint(gg[2][line.indexOf(w)+w.length()-1], gg[1][line.indexOf(w)+w.length()-1]);
                    result.add(word);}
                if(new StringBuilder(line).reverse().toString().contains(w)){
                    String reversed=new StringBuilder(line).reverse().toString();
                    Word word=new Word(w);
                    word.setStartPoint(gg[2][reversed.indexOf(w)], gg[1][reversed.length()-1-reversed.indexOf(w)]);
                    word.setEndPoint(gg[2][reversed.length()-reversed.indexOf(w)-w.length()+1], gg[1][reversed.length()-reversed.indexOf(w)-w.length()]);
                    result.add(word);
                }
            }

            //for(int i=0;i<crossword[0].length;i++){
              //  int[][] gg=new int[3][crossword.length];
                //for(int j=0)
            //}
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
