package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {

        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {

    }


    @Override
    public synchronized int compareTo(Beach o) {

        return (int) (100000*((quality / distance) - (o.getQuality() / o.getDistance())));
//        int xq = this.quality;
//        float xd = this.distance;
//        int yq = o.quality;
//        float yd = o.distance;
//        int rq = xq - yq;
//        float rd = xd - yd;
//
//
//        if (rq > 0 && rd < 0) {
//            return (int) (rq + yd - xd);
//        }
//
//
//        if (this.quality > o.quality) {
//            return (this.quality - o.quality);
//        } else return (o.quality - this.quality);
    }
}
