package org._7_game.elements;


import org._7_game.Game;

public class Obstacle extends Element {

    public Obstacle(Game game) {
        super(game);
    }

    @Override
    public String getType() {
        return "Obstacle";
    }

    @Override
    public boolean moveTo(Player player) throws Exception {
        throw new Exception("Cannot move to an obstacle");
    }


}
