/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

import static java.lang.Integer.sum;

/**
 *
 * @author Sony
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
           int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 39 ====");

        while (i < 39) {
            System.out.println("i -> " + (i + 1));
            //i += 1;
            i++;
            //i = i + 1;
        }

        System.out.println("Multiplication Tables : 39");
        int top=12;
        int product=0;
        int table = 39;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("7 * " + j + " = " + product);
     
         System.out.print("Sumando 1 : ");
         int s1= 13;
         System.out.print("Sumando 2 : ");
         int s2 = 18 ;
         int suma=s1+s2;
         System.out.println ("La suma es " + s1 + "+" + s2 +"="+ suma);
      
                
            
            
        }
        
    }
    
}
