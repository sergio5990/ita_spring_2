package com.sergio5990.ita.spring2.model;

public class Spel {
    private boolean isGood;
    private double pi;

    public Spel(boolean isGood, double pi) {
        this.isGood = isGood;
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Spel{" +
                "isGood=" + isGood +
                ", pi=" + pi +
                '}';
    }
}
