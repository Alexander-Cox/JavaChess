package com.alexander;

/**
 * Created by Xander on 18/02/2017.
 */
public class Tile {

    private int x;
    private int y;
    private boolean isSelected;
    private boolean isSelectable;

    public Tile (int x, int y) {

        this.x = x;
        this.y = y;
        this.isSelected = false;
        this.isSelectable = false;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelectable() {
        return isSelectable;
    }

    public void setSelectable(boolean selectable) {
        isSelectable = selectable;
    }
}
