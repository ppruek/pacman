package com.pruek.pacman;

import com.badlogic.gdx.ScreenAdapter;

public class GameScreen extends ScreenAdapter {
	private PacmanGame pacmanGame;
	 
    public GameScreen(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
    }
}