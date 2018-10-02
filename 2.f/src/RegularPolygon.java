/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 */
public class RegularPolygon {
    private int n=3;
    private double side=1;
    private double x;
    private double y; 
    
    public RegularPolygon (){
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0;
    }
    public RegularPolygon (int n, double side){
        this.x=0;
        this.y=0;
    }
    public RegularPolygon(int n, double side, double x, double y) {
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y; 
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter(){
        return this.n* this.side; 
    }
    public double getArea (){
        return 1.0/4.0 * this.n * Math.pow(this.side,2) * (1.0/Math.tan(Math.PI / this.n));
    }

    @Override
    public String toString() {
        return "A sokszög:\n{" + "oldalainak száma=" + n + ", \n oldalainak hossza=" + side + ","
                + " \n középpontjának x koordinátája=" + x + ", \n középpontjának y koordinátája=" + y + '}';
    }
    
    
}
    

