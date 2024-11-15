package Ai;

import logic.Strategy;
import models.BoardAction;
import models.GameConfig;
import models.GameState;
import models.Progress;

public class ThreatDetection {
    public static boolean incomingThreat(BoardAction boardAction, GameState gameState) {
        int incomEbits = 0;
        Progress progress = boardAction.getProgress();
        if (Strategy.baseById.get(boardAction.getDest()).getPlayer() == gameState.getGame().getPlayer()) {
            if (progress.getDistance() > 10) {
                incomEbits = boardAction.getAmount() - (progress.getDistance() - 10);
            } else incomEbits = boardAction.getAmount();
            return incomEbits >= Strategy.baseById.get(boardAction.getDest()).getPopulation();
        }
        return false;
    }
}
