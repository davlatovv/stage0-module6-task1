package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        if (hasFur && numberOfPaws == 1) {
            return "This animal is mostly " + (color) + ". It has " + (numberOfPaws) + " paw and a fur.";
        } else if (hasFur  && numberOfPaws > 1) {
            return "This animal is mostly " + (color) + ". It has " + (numberOfPaws) + " paws and a fur.";
        } else if (!hasFur  && numberOfPaws > 1) {
            return "This animal is mostly " + (color) + ". It has " + (numberOfPaws) + " paws and no fur.";
        }
        else {
            return "This animal is mostly " + (color) + ". It has " + (numberOfPaws) + " paw and no fur.";        }
    }
}
