package com.alexander;

public class Main {

    public static void main(String[] args) {

        //setup game

        Board chessboard = new Board();

        Tile tile = chessboard.highlightCell(0, 0);

        System.out.println("the tile coords are " + tile.getX() + "," + tile.getY());

        //loop until game finished

        Game chessgame = new Game();

        chessgame.setupGame();

        //shut game

    }
}
