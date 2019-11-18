/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_pbo;

/**
 *
 * @author Andreas
 */
public class Player extends Pacman{
    int score;
    int powerup;
    String efek;
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPowerup() {
        return powerup;
    }

    public String getEfek() {
        return efek;
    }

    public void setEfek(String efek) {
        this.efek = efek;
    }

    public void setPowerup(int powerup) {
        this.powerup = powerup;
    }
    public Player(int x, int y, String image) {
        super(x, y, image);
        this.score=0;
        this.efek="";
    }
    
}
