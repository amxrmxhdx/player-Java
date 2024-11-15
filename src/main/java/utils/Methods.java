package utils;

import models.Position;

public class Methods {

    public static int calcDist(Position a, Position b) {
        double xM = Math.pow(b.x - a.x, 2);
        double yM = Math.pow(b.y - a.y, 2);
        double zM = Math.pow(b.z - a.z, 2);
        double d = Math.sqrt(xM + yM + zM);
        return (int) Math.round(d);
    }

}