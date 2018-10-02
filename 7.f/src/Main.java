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
    
    public static int osztas(int a, int b){
        int hanyados=0;
        while(a>=b){
           hanyados=hanyados+1;
           a=a-b;
        }
        return hanyados;
    }
    
    public static void main(String[] args){
        
    System.out.println(osztas(145,48));
    }
    
}
