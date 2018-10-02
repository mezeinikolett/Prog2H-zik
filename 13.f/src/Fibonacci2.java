/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 */
public class Fibonacci2(int n){
    
    int a=0;
    int b=1;
           
    int i=0;
        
    int f=1;
            
    while (f<n){
                
        f=a+b;
                
        b=a;
        a=f;
        f=b;
                
        i++;
        }
    return f;
       
  }
    
