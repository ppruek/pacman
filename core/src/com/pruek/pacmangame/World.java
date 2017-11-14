package com.pruek.pacmangame;

public class World {
	private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
    private int score;
 
    World(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        maze = new Maze();
        pacman = new Pacman(60,60,this);
        score = 0;
        registerDotEattenListener();
    }
 
    Pacman getPacman() {
        return pacman;
    }
    
    Maze getMaze() {
        return maze;
    }
    
    public void update(float delta) {
        pacman.update();
    }
    public int getScore() {
        return score;
    }
    public void increaseScore() {
        score += 1;
    }
    private void registerDotEattenListener() {
        pacman.registerDotEattenListener(new Pacman.DotEattenListener() {
            @Override
            public void notifyDotEatten() {
                score += 1;
            }
        });
    }
}
