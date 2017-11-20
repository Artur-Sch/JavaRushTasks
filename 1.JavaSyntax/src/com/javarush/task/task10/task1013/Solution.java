package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private int age;
        private  int telefonNumber;
        private  String city;
        private   String job;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName, int telefonNumber) {
            this.name = name;
            this.lastName = lastName;
            this.telefonNumber = telefonNumber;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, int telefonNumber, String city) {
            this.name = name;
            this.lastName = lastName;
            this.telefonNumber = telefonNumber;
            this.city = city;
        }

        public Human(String name, String lastName, int telefonNumber, String city, String job) {
            this.name = name;
            this.lastName = lastName;
            this.telefonNumber = telefonNumber;
            this.city = city;
            this.job = job;
        }

        public Human(String name, String lastName, int age, int telefonNumber, String city, String job) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.telefonNumber = telefonNumber;
            this.city = city;
            this.job = job;
        }

        public Human(String name, int telefonNumber, String job) {
            this.name = name;
            this.telefonNumber = telefonNumber;
            this.job = job;
        }

        public Human(String name, String lastName, int age, int telefonNumber) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.telefonNumber = telefonNumber;
        }

        public Human(String name, int telefonNumber, String city, String job) {
            this.name = name;
            this.telefonNumber = telefonNumber;
            this.city = city;
            this.job = job;
        }
    }
}
