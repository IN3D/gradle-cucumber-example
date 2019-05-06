package io.mekmanager.example;

import org.javatuples.Pair;
import org.jetbrains.annotations.Contract;

import java.util.List;

public class Skill {
    private SkillBase base;
    private Integer level;
    private Double experience;
    // NOTE: this might benefit from stricter typing.
    private String subSkill;
    private String specialty;
    private String complexity;
    private List<Attribute> links;
    private int targetNumber;


    @Contract(pure = true)
    public Skill(SkillBase base) {
        this.base = base;
    }

    public Integer getLevel() {
        return level;
    }

    public Double getExperience() {
        return experience;
    }

    public String getSubSkill() {
        return subSkill;
    }

    public void setSubSkill(String subSkill) {
        this.subSkill = subSkill;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getComplexity() {
        return complexity;
    }

    public List<Attribute> getLinks() {
        return links;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public void setXP(Learning learning, Double xp) {
        this.experience = xp;
        this.calculateLevel(learning);
        this.calculateComplexity();
        this.calculateLinks();
        this.calculateTargetNumber();
    }

    @Override
    @Contract(pure = true)
    public String toString() {
        String str = this.base.getName();
        if (this.subSkill != null) {
            str = String.format("%s/%s", str, this.subSkill);
        }
        if (this.specialty != null) {
            str = String.format("%s (%s)", str, this.specialty);
        }

        return str;
    }

    private void calculateLevel(Learning learning) {
        int index = -1;
        Integer value = 0;
        for (Integer x : LearningService.xpList(learning)) {
            index++;
            if (this.experience >= x) {
                value = index;
            }
        }
        this.level = value;
    }

    private void calculateComplexity() {
        this.complexity = this.tieredValue(this.base.getComplexityRating());
    }

    private void calculateLinks() {
        this.links = this.tieredValue(this.base.getLinkedAttributes());
    }

    private void calculateTargetNumber() {
        this.targetNumber = this.tieredValue(this.base.getTargetNumbers());
    }

    private <T> T tieredValue(Pair<T, T> tieredSubject) {
        if (this.base.isTiered()) {
            return this.level <= 3 ? tieredSubject.getValue0(): tieredSubject.getValue1();
        } else {
            return tieredSubject.getValue0();
        }
    }
}
