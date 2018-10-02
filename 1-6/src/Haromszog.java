/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 */
 
 public class Haromszog {
    private double a;
    private double b;
    private double c;
    
    public Haromszog(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getTerulet(){
        double s;
        s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public boolean equals(Object obj){
        if (obj==null)
            return false;
        if (!(obj instanceof Haromszog))
            return false;
        if (this.getTerulet() == ((Haromszog)obj).getTerulet())
            return true;
        else
            return false;
    }
    public String toString(){
        String str="";
        str+="A háromszög oldalai: (" + "a=" + this.a +"; b="+ this.b + "; c=" + this.c +") és T=" + this.getTerulet() + ";";
        return str;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
}

