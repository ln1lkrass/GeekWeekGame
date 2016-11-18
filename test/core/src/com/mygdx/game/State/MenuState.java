package com.mygdx.game.State;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Krass on 11/18/2016.
 */
public class MenuState extends AbstractState {
    private Texture backgroundImg;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        backgroundImg = new Texture("sky.png");
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(SpriteBatch batch) {
        batch.begin();
        batch.draw(backgroundImg, 0, 0);
        batch.end();
    }

    @Override
    public void dispose() {
        backgroundImg.dispose();
    }
}
