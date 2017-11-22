package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
//    public static Map<String, String> countries = new HashMap<String, String>();
public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }


    public static void main(String[] args) {


        String name = "Ivanov, Ivan";
        String lastname = name.split(", ")[1];
        String firstname = name.split(", ")[0];

        String s = "+38(050)123-45-67";
        String part1 = s.substring(1,3);
        String part2 = s.substring(4, 7);
        String part3 = s.substring(8, 11);
        String part4 = s.substring(12, 14);
        String part5 = s.substring(15, 17);
        String number = "callto://+"+part1+part2+part3+part4+part5;
        System.out.println(number);
    }
    public static class Qwer{
        public String getCountryCode() {
            for (String s : countries.keySet()) {
                if (countries.get(s).equals("Russia")) {
                    return s;
                }
            }
            return null;
        }
    }


//    public static class IncomeDataAdapter implements Customer, Contact{
//        private IncomeData data;
//
//        public IncomeDataAdapter(IncomeData data) {
//            this.data = data;
//        }
//
//        @Override
//        public String getCompanyName() {
//            return data.getCompany();
//        }
//
//        @Override
//        public String getCountryName() {
//            return data.getCompany();
//        }
//
//        @Override
//        public String getName() {
//            return data.getContactLastName() + ", " + data.getContactFirstName();
//        }
//
//        @Override
//        public String getPhoneNumber() {
//            return null;
//        }
//    }
//
//
//    public static interface IncomeData {
//        String getCountryCode();        //example UA
//
//        String getCompany();            //example JavaRush Ltd.
//
//        String getContactFirstName();   //example Ivan
//
//        String getContactLastName();    //example Ivanov
//
//        int getCountryPhoneCode();      //example 38
//
//        int getPhoneNumber();           //example 501234567
//    }
//
//    public static interface Customer {
//        String getCompanyName();        //example JavaRush Ltd.
//
//        String getCountryName();        //example Ukraine
//    }
//
//    public static interface Contact {
//        String getName();               //example Ivanov, Ivan
//
//        String getPhoneNumber();        //example +38(050)123-45-67
//    }
}