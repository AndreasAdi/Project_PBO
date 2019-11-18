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
    String efek;
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEfek() {
        return efek;
    }

    public void setEfek(String efek) {
        this.efek = efek;
    }

    public Player(int x, int y, String image) {
        super(x, y, image);
        this.score=0;
        this.efek="";
    }
    
}
