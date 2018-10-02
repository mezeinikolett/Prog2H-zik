/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Niki
 */

public static void Növekvő(int szám1, int szám2, int szám3){

int[] t = {szám1 , szám2 , szám3} ;

int i;

int j;

for(j=0;j<3-1;j++){

    for(i=1;i<3;i++){

        if(t[i]<t[j]){

        int csere=t[j];

        t[j]=t[i];

        t[i]=csere;

        }

    }

}


for(i=0;i<3;i++){

System.out.print(tömb[i] + ",");

    }

}
}
    
