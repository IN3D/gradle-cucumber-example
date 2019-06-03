package io.mekmanager.example;

import org.javatuples.Pair;

import java.util.List;

public class SkillBase {
    private String name;
    private boolean tiered;
    private Pair<Integer, Integer> targetNumbers;
    private Pair<String, String> complexityRating;
    private Pair<List<Attribute>, List<Attribute>> linkedAttributes;

    public SkillBase() {
        this.name = "";
        this.targetNumbers = Pair.with(0, 0);
        this.complexityRating = Pair.with("", null);
        this.linkedAttributes = Pair.with(List.of(Attribute.STR), List.of(Attribute.STR, Attribute.BOD));
        this.tiered = false;
    }

    String getName() {
        return name;
    }

    boolean isTiered() {
        return tiered;
    }

    Pair<Integer, Integer> getTargetNumbers() {
        return targetNumbers;
    }

    Pair<String, String> getComplexityRating() {
        return complexityRating;
    }

    Pair<List<Attribute>, List<Attribute>> getLinkedAttributes() {
        return linkedAttributes;
    }
}
