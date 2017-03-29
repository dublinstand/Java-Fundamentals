package org._7_game.elements;


import org._7_game.Game;

public class ElementFactory {

    public static Element create(char el, int row, int col, Game game) throws Exception {

        Element e;

        switch (el) {
            case 'a':
                e = game.getPlayerOne();
                break;
            case 'b':
                e = game.getPlayerTwo();
                break;
            case 'f':
                Village vp1 = new Village(game, game.getPlayerOne());
                game.getPlayerOne().addVilage(vp1);
                e = vp1;
                break;
            case 'v':
                Village vp2 = new Village(game, game.getPlayerTwo());
                game.getPlayerTwo().addVilage(vp2);
                e = vp2;
                break;
            case 'e':
                e = new EmptyElement(game);
                break;
            case 'o':
                e = new Obstacle(game);
                break;
            case 'g':
                e = new Gold(game, 1000 + ((int)(Math.random() * 4000)));
                break;
            default:
                throw new Exception("Invalid element name supplied");
        }

        e.setRow(row);
        e.setCol(col);

        return e;
    }

}
