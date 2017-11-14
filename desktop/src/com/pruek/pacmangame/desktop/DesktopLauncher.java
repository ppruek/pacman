package com.pruek.pacmangame.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.pruek.pacmangame.PacmanGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = PacmanGame.WIDTH;
        config.height = PacmanGame.HEIGHT;
		new LwjglApplication((ApplicationListener) new PacmanGame(), config);
	}
}
