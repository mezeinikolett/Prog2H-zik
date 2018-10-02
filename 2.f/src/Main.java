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
RegularPolygon r1 = new RegularPolygon();
RegularPolygon r2 = new RegularPolygon(6, 4);
RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println("r1 kerülete: " +r1.getPerimeter());
        System.out.println("r1 területe: " +r1.getArea());
        System.out.println("r2 kerülete: " +r2.getPerimeter());
        System.out.println("r2 terulete: " +r2.getArea());
        System.out.println("r3 kerülete: " +r3.getPerimeter());
        System.out.println("r3 területe: " +r3.getArea());
    
}
}
