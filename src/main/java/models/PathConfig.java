package models;

public class PathConfig{

    int gracePeriod = 0; 
    int deathRate = 0;

    public PathConfig(int gracePeriod, int deathRate){
        this.gracePeriod = gracePeriod;
        this.deathRate = deathRate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public int getDeathRate() {
        return deathRate;
    }

    public void setDeathRate(int deathRate) {
        this.deathRate = deathRate;
    }
}
