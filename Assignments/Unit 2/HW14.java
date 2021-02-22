/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class HW14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        
       System.out.println("=====Welcome Florist=====");
       System.out.println("===My name is Evelyn===");
        
        
        int[] Florist;
        String[] flowers = {"Girasol", "Rosa", "Clavel", "Orquidea", "Lirios", "Tulipanes"};
        float[] flowersinvase = { 4.2F, 3.4F, 14.5F, 18.6F, 25.1F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of flowers -> ");
        n = input.nextInt(); 
        
          Florist = new int[n];
          
          
          /*  flowers= new string[32];*/
          flowersinvase= new float [n];
          
          Florist [1]=12;
          Florist [2]=20;
          Florist [3]=18;
          
     
        for (int i = 0; i < n; i++) {
           System.out.print("Enter the number of flowers of the vase " + (i + 1) + " -> ");
           Florist[i] = input.nextInt();
           int[] florist;
           
              
        }
        
        for (int blossom : Florist) {
            System.out.println("flowers of florist are " + blossom);
        
        }

        for (int i = 0; i < n; i++) {
            System.out.println("flowers of the vase " + (i + 1) + " -> " + Florist[i]);
        }

        for (String flower : flowers) {
            System.out.println("flower name -> " + flower);
        }

         for (int i = 0; i < flowersinvase.length ; i++) {
            System.out.println("flowers of vase " + (i + 1) + " -> " +  flowersinvase [i]);
        }

       
    }
    
}
