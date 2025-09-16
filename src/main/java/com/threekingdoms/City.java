package com.threekingdoms;

public class City {
    private String name;
    private int population; // 인구
    private int morale; // 민심 (1-100)
    private int economy; // 경제력 (1-100)
    private int gold; // 금
    private int rice; // 쌀

    public City(String name, int population, int morale, int economy, int gold, int rice) {
        this.name = name;
        this.population = population;
        this.morale = morale;
        this.economy = economy;
        this.gold = gold;
        this.rice = rice;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPopulation() { return population; }
    public void setPopulation(int population) { this.population = population; }

    public int getMorale() { return morale; }
    public void setMorale(int morale) { this.morale = morale; }

    public int getEconomy() { return economy; }
    public void setEconomy(int economy) { this.economy = economy; }

    public int getGold() { return gold; }
    public void setGold(int gold) { this.gold = gold; }

    public int getRice() { return rice; }
    public void setRice(int rice) { this.rice = rice; }

    @Override
    public String toString() {
        return String.format("도시: %s - 인구: %d, 민심: %d, 경제: %d, 금: %d, 쌀: %d",
            name, population, morale, economy, gold, rice);
    }
}