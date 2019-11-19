/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_pbo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Andreas
 */
public class Player extends Pacman{
    int score;
    String efek;

    public Player(int x, int y, Image img) {
        super(x, y, img);        
        
        this.score=0;
        this.efek="";
    }
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

    @Override
    public void draw(Graphics g){
       g.drawImage(img,x,y,32,32,null);
    }
}
