/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 */
public class Növekvő {
public static void Novekvo(int a, int b, int c){
	if(a > b && a > c && b > c){
            System.out.println("Növekvő sorrendben:"+c+","+b+","+a); 
		}
	else if(a > b && a > c && c > b){
            System.out.println("Növekvő sorrendben:"+b+","+c+","+a);
	}
	else if(b > a && b> c && a > c){
            System.out.println("Növekvő sorrendben:"+c+","+a+","+b );
	}
        else if(b > a && b > c && c > a) {
            System.out.println("Növekvő sorrendben:"+a+","+c+","+b);
         }
        else if(c > a && c > b && a> b){
            System.out.println("Növekvő sorrendben:"+b+","+a+","+c);
        }
        else{
            System.out.println("Növekvő sorrendben:"+a+","+b+","+c);
        }
        
}
}
