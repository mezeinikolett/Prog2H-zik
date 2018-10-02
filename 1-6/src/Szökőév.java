/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magdi
 */
public class Szökőév {
    public static void Szokoev(int é1, int é2){
	int é =  é1;
	int év = é2;
	if(é1 > é2){
	é = é2;
	év = é1;
	}
	int i;
        int n=0;
	for(i=é; i>=év; i++){
	if((i %4 == 0 && i%100 !=0) || i % 400 ==0){
	n++;
	}
	}
	   System.out.println(n);
	}
    
}
