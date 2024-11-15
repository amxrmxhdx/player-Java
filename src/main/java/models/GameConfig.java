package models;

import java.util.ArrayList;
import java.util.List;

public class GameConfig{

    List<BaseLevel> baseLevels =  new ArrayList<>();
    PathConfig paths = new PathConfig(0,0);

    public GameConfig(List<BaseLevel> baseLevels, PathConfig paths){
        this.baseLevels = baseLevels;
        this.paths = paths;
    }

    public List<BaseLevel> getBaseLevels() {
        return this.baseLevels;
    }

    public void setBaseLevels(List<BaseLevel> list) {
        this.baseLevels = list;
    }

    public PathConfig getPaths() {
        return paths;
    }

    public void setPaths(PathConfig paths) {
        this.paths = paths;
    }

}
