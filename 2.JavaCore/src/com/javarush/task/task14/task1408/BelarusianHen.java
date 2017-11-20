package com.javarush.task.task14.task1408;

class BelarusianHen extends Hen {
    @Override
    String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + egg + " яиц в месяц.");
    }

    int egg = 22;
    @Override
    int getCountOfEggsPerMonth() {
        return egg;
    }
}
