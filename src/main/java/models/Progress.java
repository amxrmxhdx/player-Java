package models;

public class Progress{

    int distance = 0;
    int traveled = 0;

    public Progress(int distance, int traveled){
        this.distance = distance;
        this.traveled = traveled;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTraveled() {
        return traveled;
    }

    public void setTraveled(int traveled) {
        this.traveled = traveled;
    }

    public int getDistanceLeft(){
        return distance - traveled;
    }
}
