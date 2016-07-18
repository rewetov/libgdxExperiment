package com.mynew.simpleproject.states;

//import javax.swing.plaf.nimbus.State;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.mynew.simpleproject.MySimpleGame;
import com.mynew.simpleproject.sprites.Chip;
import com.mynew.simpleproject.sprites.tile;

/**
 * Created by Alex on 16.07.2016.
 */
public class GameAreaState extends State{
    private tile tile;
    private int rows = 3;
    private int columns = 3;

    BitmapFont font = new BitmapFont();
    private SpriteBatch batch;

    private Array<tile> tiles;
    private Array<Chip> chips;

    public GameAreaState(GameStateManager gsm){
        super(gsm);

        // отрисовываем ячейки игрового поля и фишки
        fillGameArea();

        camera.setToOrtho(false, MySimpleGame.WIDTH / 2, MySimpleGame.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        camera.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        for (tile tile: tiles){
            sb.draw(tile.getTile(), tile.getPosition().x, tile.getPosition().y);
            font.draw(sb, "R_"+tile.getRow()+" C_"+tile.getCol(), tile.getPosition().x, tile.getPosition().y + 30);
        }

        for (Chip Chip: chips){
            sb.draw(Chip.getChip(), Chip.getPosition().x, Chip.getPosition().y);
        }
        sb.end();
    }

    @Override
    public void dispose(){
        for (tile tile: tiles){
            tile.dispose();
        }

        for (Chip chip: chips){
            chip.dispose();
        }
        System.out.println("GameArea disposed");
    }


    public void fillGameArea(){
        chips = new Array<Chip>();
        tiles = new Array<tile>();

        // рисуем ячейки на поле
        for (int i =0; i < columns; i++){
            for (int j = 0; j < rows; j++){
                tiles.add(new tile((i * 65), (j * 65), j, i));
            }
        }

        // рисуем фишки игрока
        for (int i = 0; i < columns; i++){
            chips.add(new Chip("you", (i * 65), 0, 0, i));
        }

        // рисуем фишки врага
        for (int i = 0; i < columns; i++){
            chips.add(new Chip("enemy", (i * 65), ((rows - 1) * 65), (rows - 1), i));
        }
    }
}
