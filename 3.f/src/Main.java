/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 */
public class Main {
     public static void main(String[] args){
        Rectangle r1= new Rectangle();
        Rectangle r2= new Rectangle(2, 3.5);
        
        double r3=4;
        System.out.println(r3);
        
        System.out.println(r1);
        System.out.println("A téglalap területe="+r2.getArea());
        System.out.println("A téglalap kerülete="+r2.getPerimeter());
        System.out.println(r2.getHeight());
        
        r2.setHeight(17);
        System.out.println(r2.getHeight());
    }
}
