package com.pruek.pacmangame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
	private PacmanGame pacmanGame;
	private Texture pacmanImg;
	//private int x,y;
	private Pacman pacman;
	 
    public GameScreen(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        pacmanImg = new Texture("pacman.png");
        //x = 100;
        //y = 100;
        pacman = new Pacman(100, 100);
    }
    private void update(float delta) {
    	if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            //x -= 10;
    		pacman.move(Pacman.DIRECTION_LEFT);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            //x += 10;
        	pacman.move(Pacman.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            //y -= 10;
        	pacman.move(Pacman.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            //y += 10;
        	pacman.move(Pacman.DIRECTION_UP);
        }
    }
    public void render(float delta) {
        SpriteBatch batch = pacmanGame.batch;
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        update(delta);
        batch.begin();
        Vector2 pos = pacman.getPosition();
        batch.draw(pacmanImg, pos.x, pos.y);
        //batch.draw(pacmanImg, x, y);
        batch.end();
    }
}
