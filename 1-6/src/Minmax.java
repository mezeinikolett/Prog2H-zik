/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magdi
 */
public class Minmax {
    public static void Minabmax(int a, int b, int c){
	int min = 0;
	int abmax = 0;
	
	if(a < b && a < c){
	min = a;
	} 
	else if(b < a && b < c){
	min = b;
	} 
	else{
	min = c;
	} 
	System.out.println("min:"+min);
	
	a = Math.abs(a);
	b = Math.abs(b);
	c = Math.abs(c);
	if ( a > b && a > c) {
	abmax = a;
	}
	else if(b > a && b > c) {
	abmax = b;
	}
	else{
	abmax = c;
	}
	System.out.println("Abmax:"+abmax);
}
	
    
}
