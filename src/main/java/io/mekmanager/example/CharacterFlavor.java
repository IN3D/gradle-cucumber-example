package io.mekmanager.example;

import org.jetbrains.annotations.Contract;

public class CharacterFlavor {
    /** A character's height, in centimeters. */
    private double height;
    /** A character's weight, in kilograms. */
    private double weight;
    /** A character's hair color. */
    private String hair;
    /** A character's eye color. */
    private String eyes;
    private String biography;

    @Contract(pure = true)
    public CharacterFlavor() {
        this.height = 170.0; // Roughly 5' 7"
        this.weight = 79.0; // Roughly 175lbs
        this.hair = "";
        this.eyes = "";
        this.biography = "";
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
