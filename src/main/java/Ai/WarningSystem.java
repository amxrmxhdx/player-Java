package Ai;

import logic.Strategy;
import models.Base;
import models.GameState;
import models.PlayerAction;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class WarningSystem {

    public static List<Base> checkOverPopulation(GameState gameState) {
        List<Base> ret = new ArrayList<>();
        for (Base b : Strategy.getBasesByPlayer(gameState.getGame().getPlayer())) {
            if (b.getPopulation() + b.getSpawnRate(gameState) >= b.getMaxPopulation(gameState))
                ret.add(b);
        }
        return ret;
    }

    public static List<PlayerAction> react(Base b, GameState gameState) {
        List<Base> pBases = Strategy.getBasesByPlayer(b.getPlayer());
        List<Base> pBasesWO = Strategy.getBasesByPlayer(b.getPlayer()).stream().filter(i -> i.getUid() != b.getUid()).toList();
        List<PlayerAction> ret = new ArrayList<>();

        int rest = b.getSpawnRate(gameState);

        // CHECK IF UPGRADABLE
        if (b.getLevel() + 1 <= gameState.getConfig().getBaseLevels().size()) {
            if (rest > b.getUnitsUntilUpgrade()) {
                int pos = rest - b.getUnitsUntilUpgrade();
                ret.add(new PlayerAction(b.getUid(), b.getUid(), pos));
                rest -= pos;
            } else {
                ret.add(new PlayerAction(b.getUid(), b.getUid(), rest));
                return ret;
            }
        }

        return ret;
    }

}
