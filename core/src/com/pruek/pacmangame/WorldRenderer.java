package com.pruek.pacmangame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private SpriteBatch batch;
	private PacmanGame pacmanGame;
	private World world;
	private Texture pacmanImg;
	private MazeRenderer mazeRenderer;
	public static final int BLOCK_SIZE = 40;

	public WorldRenderer(PacmanGame pacmanGame, World world) {
	    this.pacmanGame = pacmanGame;
	    batch = pacmanGame.batch;
	    this.world = world;
	    pacmanImg = new Texture("pacman.png");
	    mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
	}
	
	public void render(float delta) {
		SpriteBatch batch = pacmanGame.batch;
		Vector2 pos = world.getPacman().getPosition();
		mazeRenderer.render();
		batch.begin();
		batch.draw(pacmanImg, pos.x - BLOCK_SIZE/2, 
                 PacmanGame.HEIGHT - pos.y - BLOCK_SIZE/2);
        batch.end();
	}
}