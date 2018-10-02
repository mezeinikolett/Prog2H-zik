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
        QuadraticEquation e1= new QuadraticEquation(1, 2, 3);
        QuadraticEquation e2= new QuadraticEquation(2, 4, 1);
        
        System.out.println("x1="+e1.getRoot1()+" "+"x2="+e1.getRoot2());
        System.out.println("x1="+e2.getRoot1()+" "+"x2="+e2.getRoot2());
        System.out.println(e1);
        
    }
        
    
   }
