package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
            testMethod2();
            Exception e1 =  new ClassCastException();
            Exception e2 =  new NumberFormatException();
            Exception e3 =  new IllegalArgumentException();
            Exception e4 =  new NullPointerException();
//            Exception e5 =  new TypeNotPresentException();
            Exception e6 =  new ArrayStoreException();
//            Exception e7 =  new EnumConstantNotPresentException();
            Exception e8 =  new ArrayIndexOutOfBoundsException();
            Exception e9 =  new Exception();
        } catch (ArithmeticException e) {
            exceptions.add(e);
        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new ClassCastException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new Exception());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new InterruptedException ());
        //напишите тут ваш код

    }

    private static void testMethod2() {

    }
}
