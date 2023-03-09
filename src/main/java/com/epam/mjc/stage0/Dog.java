package com.epam.mjc.stage0;

public class Dog extends Animal {
    public Dog() {
        super("brown", 4, true);
    }

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        String paws = getNumberOfPaws() == 1 ? "paw" : "paws";
        String fur = isHasFur() ? "a" : "no";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + paws + " and " + fur + " fur.";
    }
}