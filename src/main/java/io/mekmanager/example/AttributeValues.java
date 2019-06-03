package io.mekmanager.example;

import org.jetbrains.annotations.Contract;

public class AttributeValues {
    private int score;
    private int link;
    private int xp;

    @Contract(pure = true)
    public AttributeValues(int score, int link, int xp) {
        this.score = score;
        this.link = link;
        this.xp = xp;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLink() {
        return link;
    }

    public void setLink(int link) {
        this.link = link;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
