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
public class PowerUp extends Pacman{
    int durasi;
    public PowerUp(int x, int y, String image) {
        super(x, y, image);
        this.durasi=10;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    
}
