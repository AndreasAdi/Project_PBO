/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_pbo;

import java.awt.Image;

/**
 *
 * @author Andreas
 */
public class Ghost extends Pacman{
    String efek;
    int move;


    public Ghost(int x, int y, Image img) {
        super(x, y, img);
        this.efek="";
        this.move=1000;

    }
    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public String getEfek() {
        return efek;
    }

    public void setEfek(String efek) {
        this.efek = efek;
    }
    
}
