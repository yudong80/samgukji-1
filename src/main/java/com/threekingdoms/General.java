package com.threekingdoms;

public class General {
    private String name;
    private String kingdom; // 위(Wei), 촉(Shu), 오(Wu)
    private int force; // 무력 (1-100)
    private int intelligence; // 지력 (1-100)
    private int leadership; // 통솔력 (1-100)
    private int charm; // 매력 (1-100)

    public General(String name, String kingdom, int force, int intelligence, int leadership, int charm) {
        this.name = name;
        this.kingdom = kingdom;
        this.force = force;
        this.intelligence = intelligence;
        this.leadership = leadership;
        this.charm = charm;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getKingdom() { return kingdom; }
    public void setKingdom(String kingdom) { this.kingdom = kingdom; }

    public int getForce() { return force; }
    public void setForce(int force) { this.force = force; }

    public int getIntelligence() { return intelligence; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }

    public int getLeadership() { return leadership; }
    public void setLeadership(int leadership) { this.leadership = leadership; }

    public int getCharm() { return charm; }
    public void setCharm(int charm) { this.charm = charm; }

    @Override
    public String toString() {
        return String.format("장수: %s (%s) - 무력: %d, 지력: %d, 통솔: %d, 매력: %d",
            name, kingdom, force, intelligence, leadership, charm);
    }
}