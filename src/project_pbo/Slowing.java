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
public class Slowing extends PowerUp{
    String tipe;



    public Slowing(int x, int y, Image img) {
        super(x, y, img);
        this.tipe="s";
    }
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public void slow(Player p,Ghost g){
        if(p.getEfek().equals("s")){
            g.setMove(2000);//Memperlambat Pergerakan Ghost menjadi 1 petak setiap 2 detik
        }
    }
}
