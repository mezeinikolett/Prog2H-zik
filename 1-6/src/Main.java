/*import java.until.Scanner;
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
  
// 1. feladat  
System.out.println(Novekvo(28, 11, 86));   
 
// 2. feladat   
    System.out.println(Minabmax(18,23,32));
    
// 3. feladat   
    System.out.println(Sorba(3, 1, 5));
    
//4. feladat 
System.out.println(Haromszog(9, 13, 16));   


// 5. feladat   
    System.out.println(Szokoev(1900,2018));
    
          
    
    
//    6.feladat
    
    int jegy;
    System.out.println("Az osztályzat: ");
    Scanner jegy= new Scanner(System.in);
    
	switch(jegy){
		case 5: 
			printf("Jeles");
			break;
		case 4: 
			printf("Negyes");
			break;
		case 3:
			printf("Kozepes");
			break;
		case 2:
			printf("Elegseges");
			break;
		default:
			printf("Ervenytelen");
			
			
	}
	
	return 0; 
}
    
    
}
    
}
