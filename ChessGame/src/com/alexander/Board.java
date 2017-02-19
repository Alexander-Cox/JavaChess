package com.alexander;

/**
 * Created by Xander on 18/02/2017.
 */
public class Board {

    private Tile[] tiles;
    private int width = 8;

    public  Board () {
        // creates an array of tiles for future ref
        this.tiles = new Tile[this.width*this.width];
        int x = 0;
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.width; j++) {
                this.tiles[x++] = new Tile(i,j);
            }
        }
    }

    //methods for highlighting tiles based on the x and y coords passed in

    public Tile highlightCell(int x, int y) {
        return tiles[getTileIndex(x,y)];
        //then highlight
        //this should be void although returns tile for testing
    }

    private int getTileIndex(int x, int y) {
       return (this.width * x) + y;
    }

}
