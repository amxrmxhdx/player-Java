package models;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    public List<BoardAction> getActions() {
        return actions;
    }

    public void setActions(List<BoardAction> actions) {
        this.actions = actions;
    }

    public List<Base> getBases() {
        return bases;
    }

    public void setBases(List<Base> bases) {
        this.bases = bases;
    }

    public GameConfig getConfig() {
        return config;
    }

    public void setConfig(GameConfig config) {
        this.config = config;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    List<BoardAction> actions = new ArrayList<>();
    List<Base> bases = new ArrayList<>();
    GameConfig config = new GameConfig(new ArrayList<BaseLevel>(), new PathConfig(0, 0));
    Game game = new Game(0, 0, 0, 0, 0);

    public GameState(List<BoardAction> actions, List<Base> bases, GameConfig config, Game game){
        this.actions = actions;
        this.bases = bases;
        this.config = config;
        this.game = game;
    }
}
