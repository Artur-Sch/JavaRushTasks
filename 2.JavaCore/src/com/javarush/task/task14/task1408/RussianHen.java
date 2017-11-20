package com.javarush.task.task14.task1408;

class RussianHen extends Hen {
    @Override
    String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + egg + " яиц в месяц.");
    }

    int egg = 26;
    @Override
    int getCountOfEggsPerMonth() {
        return egg;
    }
}