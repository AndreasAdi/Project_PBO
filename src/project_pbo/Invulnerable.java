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
public class Invulnerable extends PowerUp{
    String tipe;
    public Invulnerable(int x, int y, String image) {
        super(x, y, image);
        this.tipe="i";
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public void invincible(Player p,Ghost g){
        if(p.getEfek().equals("i")){
            g.setEfek("v");//Memberikan status vulnerable kepada ghost sehingga bisa di makan
        }
    }
}
