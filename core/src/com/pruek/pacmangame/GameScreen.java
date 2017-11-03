package com.pruek.pacmangame;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private PacmanGame pacmanGame;
	private Texture pacmanImg;
	private int x;
    private int y;
	 
    public GameScreen(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        pacmanImg = new Texture("pacman.png");
        x = 100;
        y = 100;
    }
    public void render(float delta) {
        SpriteBatch batch = pacmanGame.batch;
        batch.begin();
        batch.draw(pacmanImg, 100, 100);
        x += 5;
        batch.draw(pacmanImg, x, y);
        batch.end();
    }
}
