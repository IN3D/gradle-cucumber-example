package io.mekmanager.example;

public class AttributeValues {
    private int score;
    private int link;
    private int xp;

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
