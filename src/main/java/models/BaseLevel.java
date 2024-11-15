package models;

public class BaseLevel {

    int maxPopulation = 0;
    int upgradeCost = 0;
    int spawnRate = 0;

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public void setMaxPopulation(int maxPopulation) {
        this.maxPopulation = maxPopulation;
    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public void setUpgradeCost(int upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

    public int getSpawnRate() {
        return spawnRate;
    }

    public void setSpawnRate(int spawnRate) {
        this.spawnRate = spawnRate;
    }

    public BaseLevel(int maxPopulation, int upgradeCost, int spawnRate){
        this.maxPopulation = maxPopulation;
        this.upgradeCost = upgradeCost;
        this.spawnRate = spawnRate;
    }
}
