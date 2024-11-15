package models;

public class Game{

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public int getRemainingPlayers() {
        return remainingPlayers;
    }

    public void setRemainingPlayers(int remainingPlayers) {
        this.remainingPlayers = remainingPlayers;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    int uid = 0;
    int tick = 0; 
    int playerCount = 0; 
    int remainingPlayers = 0; 
    int player = 0;

    public Game(int uid, int tick, int playerCount, int remainingPlayers, int player){
        this.uid = uid;
        this.tick = tick;
        this.playerCount = playerCount;
        this.remainingPlayers = remainingPlayers;
        this.player = player;
    }
}
