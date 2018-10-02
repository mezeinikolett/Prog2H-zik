
import java.io.Console;

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

public static void main(String[] args) {

int szam=Console.readInt("Kérek egy számot");

int i;

boolean prim=true;


for (i=2; i<=szam-1;i++){

if(szam%i==0)

prim=false;

}

if (prim) System.out.println("Prím");

else

System.out.println("Nem prím");

}

}
