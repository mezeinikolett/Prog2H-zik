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
    
LinearEquation e1 = new LinearEquation (5, 8, -12, 24, 36, 49);
LinearEquation e2 = new LinearEquation(3, 12, 28, -3, 33, 14);
LinearEquation e3 = new LinearEquation(12, 48, 56, 73, -17, 32);
        
System.out.println("e1: " + e1.getX() + ", " + e1.getY());
System.out.println("e2: " + e2.getX() + ", " + e2.getY());
System.out.println("e3: " + e3.getX() +", " + e3.getY());
   
}   
}
