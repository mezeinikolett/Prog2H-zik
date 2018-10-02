/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 */
public class Faktoriális {
  
public static long Kiszamol1( long n ) {
    long eredmeny = 1;
    int i = 1;
    while ( i < (n + 1) ) {
      eredmeny *= i;
      i++;
    }
    return eredmeny;
  }

  
  public static long Kiszamol2( long n ) {
    if ( n > 1 ) return n * Kiszamol2(n - 1);
    else return 1;
  }


  public static void main( String[] parameterek ) {
    if ( parameterek.length == 1 ) {
      int n = Integer.parseInt(parameterek[0]);
      System.out.println(n + "! = " + Kiszamol1(n) + " , " + Kiszamol2(n) + " ");
    }
    else {
      System.out.println("A szam faktorialis erteke: ");
    }
  }
}
    

