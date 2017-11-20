package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandmother1 = new Human("Нина", false, 56);
        Human grandmother2 = new Human("Валентина", false, 58);
        Human grandfather1 = new Human("Валентин", true, 59);
        Human grandfather2 = new Human("Семен", true, 61);
        Human mother = new Human("Аня", false, 25, grandfather1, grandmother1);
        Human father = new Human("Андрей", true, 28, grandfather2, grandmother2);
        Human son = new Human("Игорь", true, 4, father, mother);
        Human douter = new Human("Alina", false, 4, father, mother);
        Human son2 = new Human("Artur", true, 5, father, mother);
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(douter.toString());
        System.out.println(son2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















