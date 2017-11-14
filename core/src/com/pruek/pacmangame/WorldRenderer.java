package com.pruek.pacmangame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private SpriteBatch batch;
	private PacmanGame pacmanGame;
	private World world;
	private Texture pacmanImg;

	public WorldRenderer(PacmanGame pacmanGame, World world) {
	    this.pacmanGame = pacmanGame;
	    batch = pacmanGame.batch;
	    this.world = world;
	    pacmanImg = new Texture("pacman.png");
	}
	
	public void render(float delta) {
		Vector2 pos = world.getPacman().getPosition();
		batch.begin();
		batch.draw(pacmanImg, pos.x, pos.y);
        batch.end();
	}
}