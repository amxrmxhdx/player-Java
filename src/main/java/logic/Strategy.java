package logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Base;
import models.GameState;
import models.PlayerAction;

public class Strategy{

    public static Map<Integer, Base> baseById = null;

    public static void fetchBases(List<Base> bases) {
        baseById = new HashMap<>();
        for (Base b : bases)
            baseById.put(b.getUid(), b);
    }

    public static List<Base> getBasesByPlayer(int player) {
        List<Base> ret = new ArrayList<>();
        for (Base b : baseById.values()) {
            if (b.getPlayer() == player)
                ret.add(b);
        }
        return ret;
    }

    public static List<Base> getBasesExPlayer(int player) {
        List<Base> ret = new ArrayList<>();
        for (Base b : baseById.values()) {
            if (b.getPlayer() != player)
                ret.add(b);
        }
        return ret;
    }

    public static List<PlayerAction> decide(GameState gameState){
        fetchBases(gameState.getBases());
        gameState.getBases().get(0);
        List<PlayerAction> playerAction = new ArrayList<>();
        playerAction.add(new PlayerAction(0, 0, 0));
        return playerAction;
    }
}
