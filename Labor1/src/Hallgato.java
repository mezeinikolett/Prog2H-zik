/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgato {
    
    String név;
    String nkód;
    double átlag;
    int évfolyama;

    public Hallgato(String név, String nkód, int évfolyama) {
        this.név = név;
        this.nkód = nkód;
        this.évfolyama = évfolyama;
    }
    
    
        
            
    public void köszön(Hallgato kinek)
        {
            
            System.out.println("Jó napot!"+" "+ kinek.getNév());
                              
        }
        
    public String getNév()
        {
            return név;
        }
        
               
    
}
