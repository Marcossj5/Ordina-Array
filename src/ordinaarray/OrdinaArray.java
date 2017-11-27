/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordinaarray;

import java.util.stream.IntStream;

/**
 *
 * @author tss
 */
public class OrdinaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scrivere array di ordinamento dei numeri

        int[] numeri = {17, 25, 3, 8, 74, 35, 63};

        boolean scambiato = true;

        while (scambiato==true) {
            scambiato = false;
            int index = 0;
            while (index < numeri.length - 1) {
                if (numeri[index] > numeri[index + 1]) {
                    //scambio
                    int tmp = numeri[index];
                    numeri[index] = numeri[index + 1];
                    numeri[index + 1] = tmp;
                    scambiato = true;
                }
                index++;
            }
        }
//stampo

        for (int i = 0; i < numeri.length; i++) {
            
            int valore =numeri [i];
            
            System.out.println(valore);
            
        }
    }

}
