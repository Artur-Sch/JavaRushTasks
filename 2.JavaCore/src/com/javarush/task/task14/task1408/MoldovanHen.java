package com.javarush.task.task14.task1408;

 class MoldovanHen extends Hen {
    @Override
    String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + egg + " яиц в месяц.");
    }

    int egg = 13;
    @Override
    int getCountOfEggsPerMonth() {
        return egg;
    }
}