package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        String paws = getNumberOfPaws() == 1 ? "paw" : "paws";
        String fur = isHasFur() ? "a" : "no";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + paws + " and " + fur + " fur. Moreover, it has 2 wings and can fly.";
    }
}
