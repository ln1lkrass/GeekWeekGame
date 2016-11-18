package com.mygdx.game.State;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by Krass on 11/18/2016.
 */
public class GameStateManager {
    private final Stack<AbstractState> states;

    public GameStateManager() {
        this.states = new Stack<AbstractState>();
    }

    public void push(AbstractState state){
        states.push(state);
    }

    public  void pop(){
        states.pop().dispose();
    }

    public void set(AbstractState state){
        this.pop();
        states.push(state);
    }

    public void update(float delta){
        states.peek().update(delta);
    }

    public void render(SpriteBatch batch){
        states.peek().render(batch);
    }
}

