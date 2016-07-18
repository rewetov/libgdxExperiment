package com.mynew.simpleproject.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Alex on 16.07.2016.
 */
public class Chip {
    private Vector3 position;
    private Texture chip;
    private String kind;
    private int row;
    private int col;

    public Chip(String knd, int x, int y, int r, int c){
        position = new Vector3(x, y, 0);
        row = r;
        col = c;
        kind = knd;
        if (kind == "you")
            chip = new Texture("you.png");
        if (kind == "enemy")
            chip = new Texture("enemy.png");
    }


    public Vector3 getPosition() {
        return position;
    }


    public String getKind(){
        return kind;
    }

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return col;
    }


    public Texture getChip(){
        return chip;
    }

    public void update(){

    }

    public void dispose(){
        chip.dispose();
    }
}
