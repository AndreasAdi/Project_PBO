/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_pbo;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Andreas
 */
public class Pacman {

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
    int x;
    int y;
//    String image;
    Image img;

    public Pacman(int x, int y, Image img) {
        this.x = x;
        this.y = y;
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
    public  void draw(Graphics g){
    };
}
