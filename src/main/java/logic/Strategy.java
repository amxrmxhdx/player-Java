package logic;

import java.util.ArrayList;
import java.util.List;

import models.GameState;
import models.PlayerAction;

public class Strategy{
    
    public static List<PlayerAction> decide(GameState gameState){
        //TODO: add your logic here
        gameState.getBases().get(0);
        List<PlayerAction> playerAction = new ArrayList<>();
        playerAction.add(new PlayerAction(0, 0, 0));
        return playerAction;
    }
}
