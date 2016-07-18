package com.mynew.simpleproject.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;


/**
 * Created by Alex on 16.07.2016.
 */
public class tile {
    private Texture tile;
    private Vector3 position;

    private int row, col;

    public tile(int x, int y, int r, int c){
        position = new Vector3(x, y, 0);
        tile = new Texture("slot.png");
        row = r;
        col = c;
        //font.draw(batch, "R_"+row+" C_"+col, this.getPosition().x, this.getPosition().y);
    }


    public Vector3 getPosition() {
        return position;
    }


    public void setRow(int i){
        row = i;
    }


    public void setCol(int i){
        col = i;
    }


    public int getRow(){
        return row;
    }


    public int getCol(){
        return col;
    }


    public Texture getTile(){
        return tile;
    }

    public void update(){

    }

    public void dispose(){
        tile.dispose();
    }
}
