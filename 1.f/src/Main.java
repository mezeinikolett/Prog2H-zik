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
        
        Pont p1=new Pont(1,3);
        Pont p2=new Pont(4,7);
        
        p1.setPont2(p1.getPont2()+5);
        p2.setPont1(p2.getPont1()-3.4);
        
        System.out.println("Pont1: "+p1.getPont1()+","+p1.getPont2());
        System.out.println("Pont2: "+p2.getPont1()+","+p2.getPont2());
    }
}
      