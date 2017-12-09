package com.javarush.task.task20.task2025;

import java.util.LinkedList;

/*
Алгоритмы-числа
*/
public class Solution1 {
        public static long[] getNumbers(long N) {
            long[] result = null;
            LinkedList<Long> list = new LinkedList<>();

            // Создаем и инициализируем массив степененй
            long[][] mult = new long[10][19];
            for (int i = 0; i < mult.length; i++) {
                for (int j = 0; j < mult[i].length; j++) {
                    long tmp = i;
                    int degree = j;
                    while (degree-- > 0) {
                        tmp *= i;
                    }
                    mult[i][j] = tmp;
                }
            }
            byte bitness_start = 1;
            long length = 10;
            for (long i = 1; i <= N; i++) {
                long tmp = i;
                long res = 0;
                do {
                    res += mult[(int)tmp % 10][bitness_start - 1];
                    tmp /= 10;
                } while (tmp != 0);
                if (res == i) {
                    list.add(i);
                }
                if (i == length) {
                    length *= 10;
                    bitness_start++;
                }
            }
            result = new long[list.size()];
            int i = 0;
            for (Long value : list) {
                result[i++] = value;
            }        return result;
        }

    public static void main(String[] args) {
        Long t0 = System.currentTimeMillis();
        long[] lst = getNumbers(Long.MAX_VALUE);
        Long t1 = System.currentTimeMillis();
        System.out.println("time: " + (t1 - t0) / 1000d + " sec");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + ", ");
        }
        System.out.println();
    }
}
