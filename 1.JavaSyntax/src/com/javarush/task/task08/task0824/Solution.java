package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Vasja", true, 56);
        Human grandmother1 = new Human("Aly", false, 52);
        Human grandfather2 = new Human("Boris", true, 58);
        Human grandmother2 = new Human("Anna", false, 54);
        Human father = new Human("Victor", true, 30);
        Human mother = new Human("Valery", false, 26);
        Human son1 = new Human("Bob", true, 8);
       Human son2 = new Human("Paul", true, 4);

        Human douther = new Human("Lera", false, 6);
        grandfather1.children.add(father);
        grandmother1.children.add(father);
        grandfather2.children.add(mother);
        grandmother2.children.add(mother);
        mother.children.add(son1);
        father.children.add(son1);
        mother.children.add(son2);
        father.children.add(son2);
        mother.children.add(douther);
        father.children.add(douther);
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(douther.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
