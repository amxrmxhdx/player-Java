package Ai;

import logic.Strategy;
import models.*;
import utils.Methods;

public class ThreatDetection {
    public static boolean incomingThreat(BoardAction boardAction, GameState gameState) {
        Base base = Strategy.baseById.get(boardAction.getDest());
        int incomEbits = 0;
        Progress progress = boardAction.getProgress();
        if (base.getPlayer() == gameState.getGame().getPlayer()) {
            if (progress.getDistance() > 10) {
                incomEbits = boardAction.getAmount() - (progress.getDistance() - 10);
            } else incomEbits = boardAction.getAmount();
            return incomEbits >= base.getPopulation() + Methods.BitsInTurns(base, progress.getDistanceLeft(), gameState);
        }
        return false;
    }
}
