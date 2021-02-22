/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizarrays;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class QuizArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int[] Farm;
        String[] Animals = {"Caballo", "Vaca", "Perro", "Conejo", "Pato",};
        float[] Animalsweight = { 100,5F, 255,2F, 185,6F, 186,3F, 195,4F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the weight of the animals-> ");
        n = input.nextInt(); 
        
        
           Farm = new int[n];
          
          
          /*  Animals= new string[32];*/
          Animalsweight= new float [n];
          
          Farm [1]=14;
          Farm [2]=22;
          Farm [3]=36;
          
          
        for (int i = 0; i < n; i++) {
           System.out.print("Enter the weight of the animals " + (i + 1) + " -> ");
           Farm[i] = input.nextInt();
           int[] farm;
           
              
      
        
        }
        
        for (int animal: Farm) {
            System.out.println("animals of farm are " + animal);
        
        }

        for (int i = 0; i < n; i++) {
            System.out.println("animals of the farm " + (i + 1) + " -> " + Farm[i]);
        }

        for (String animal : animals) {
            System.out.println("animal name -> " + animal);
        }

         for (int i = 0; i < Animalsweight.length ; i++) {
            System.out.println("animals of weigh" + (i + 1) + " -> " +  Animalsweight [i]);
            

            {