package com.pruek.pacmangame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	private SpriteBatch batch;
	private PacmanGame pacmanGame;
	private World world;
	private Texture pacmanImg;
	private MazeRenderer mazeRenderer;
	public static final int BLOCK_SIZE = 40;
	private BitmapFont font;


	public WorldRenderer(PacmanGame pacmanGame, World world) {
	    this.pacmanGame = pacmanGame;
	    batch = pacmanGame.batch;
	    this.world = world;
	    pacmanImg = new Texture("pacman.png");
	    mazeRenderer = new MazeRenderer(pacmanGame.batch, world.getMaze());
	    font = new BitmapFont();
	}
	
	public void render(float delta) {
		SpriteBatch batch = pacmanGame.batch;
		Vector2 pos = world.getPacman().getPosition();
		mazeRenderer.render();
		batch.begin();
		batch.draw(pacmanImg, pos.x - BLOCK_SIZE/2, 
                 PacmanGame.HEIGHT - pos.y - BLOCK_SIZE/2);
		font.draw(batch, "" + world.getScore(), 700, 60);
        batch.end();
	}
}