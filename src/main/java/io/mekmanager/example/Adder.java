package io.mekmanager.example;

import org.jetbrains.annotations.Contract;

public class Adder {
    private int value;

    @Contract(pure = true)
    public Adder(int initialValue) {
        this.value = initialValue;
    }

    public int getValue() {
        return value;
    }

    public void increment(int value) {
        this.value += value;
    }
}
