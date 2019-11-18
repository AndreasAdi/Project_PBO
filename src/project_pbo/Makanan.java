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
public class Makanan extends Pacman{
    int poin;

    

    public Makanan(int x, int y, Image img) {
        super(x, y, img);
          this.poin=10;
    }

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }
    
}
