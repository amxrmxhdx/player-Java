package models;

import java.util.UUID;

public class BoardAction{

    int src = 0;
    int dest = 0;
    int amount = 0;
    UUID uuid = new UUID(0, 0);
    int player = 0;
    Progress progress = new Progress(0, 0);

    public BoardAction(int src, int dest, int amount, UUID uuid, int player, Progress progress){
        this.src = src;
        this.dest = dest;
        this.amount = amount;
        this.uuid = uuid;
        this.player = player;
        this.progress = progress;
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
}
