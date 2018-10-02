/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 * 
 */
public class Main {
    public static void main(String[] args) {
        boolean prim = true;
        int szamlalo = 0;
        int i = 1; 
        do{
            i++;
            prim = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                prim = false;
                break;
                }
            }
            if(prim == true){
                System.out.print(i + " ");
                szamlalo++;
            } 
        }while(szamlalo != 100);
    }
}

