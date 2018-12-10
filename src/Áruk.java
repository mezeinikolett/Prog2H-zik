/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Niki
 */


public class Áruk extends JFrame{

    private JButton bt1;  
    private JButton bt2;
    
    private JLabel név;
    private JLabel egység;
    private JLabel mennyiség;
    private JLabel ár;
    private JLabel szavatosság;
   
    
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
   
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;
   
    public Áruk() throws HeadlessException{
         super("Árukészlet");
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
         
         bt1=new JButton("Áru feltöltése");
         bt2=new JButton("Áru eladása");
         
         tf1=new JTextField(20);
         tf2=new JTextField(20);
         tf3=new JTextField(20);
         tf4=new JTextField(20);
         tf5=new JTextField(20);
               

         név=new JLabel("Név: ");
         egység=new JLabel("Egység: ");
         mennyiség=new JLabel("Mennyiség: ");
         ár=new JLabel("Ár: ");
         szavatosság=new JLabel("Szavatosság: ");

         
         p1=new JPanel();
         p2=new JPanel();
         p3=new JPanel();
         p4=new JPanel();
         p5=new JPanel();
         p6=new JPanel();
         p7=new JPanel();
       
         
         GridLayout gr=new GridLayout(7, 1);
         setLayout(gr);
         
         GridLayout gr1=new GridLayout(1,2);
         p1.setLayout(gr1);
         
         GridLayout gr2=new GridLayout(1,2);
         p2.setLayout(gr2);
         
         GridLayout gr3=new GridLayout(1,2);
         p3.setLayout(gr3);
         
         GridLayout gr4=new GridLayout(1,2);
         p4.setLayout(gr4);
         
         GridLayout gr5=new GridLayout(1,2);
         p5.setLayout(gr5);
         
         GridLayout gr6=new GridLayout(1,2);
         p6.setLayout(gr6);
         
         GridLayout gr7=new GridLayout(1,2);
         p7.setLayout(gr7);
     
         
         p1.add(név);
         p1.add(tf1);
         p2.add(egység);
         p2.add(tf2);
         p3.add(mennyiség);
         p3.add(tf3);
         p4.add(ár);
         p4.add(tf4);
         p5.add(szavatosság);
         p5.add(tf5);
         p6.add(bt1);
         p6.add(bt2);

         
         
         this.add(p1);
         this.add(p2);
         this.add(p3);
         this.add(p4);
         this.add(p5);
         this.add(p6);
      
         pack();
         
    }
    
    public static void main(String[] args) {
        Áruk á=new Áruk();
        
    }

    }
