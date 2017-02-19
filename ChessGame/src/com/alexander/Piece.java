package com.alexander;

/**
 * Created by Xander on 13/02/2017.
 */
public abstract class Piece {

    private int x;
    private int y;
    private boolean isMovable;
    private boolean isTaken;
    private String type;
    private boolean isSelected;

    public Piece(int x, int y, String type){
        this.x = x;
        this.y = y;
        this.type = type;
        this.isTaken = false;
        this.isSelected = false;
        //this.isMovable = true;
    }

    public void movePiece(int xOffset, int yOffset){
        this.x += xOffset;
        this.y += yOffset;
    }

    public boolean isMoveValid(int xOffset, int yOffset){
        //needs to be completed
        return true;

    }

}
