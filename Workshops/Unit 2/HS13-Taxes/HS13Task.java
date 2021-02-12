/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hs13.task;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class HS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
  int opcion=0;
  do{
  System.out.println(" *****Hi*****");
  System.out.println(" *****My mane is Evelyn*****");
  System.out.println(" ********OPTION MENU******");
  System.out.println(" 1. Calculator for the area of the Circle ");
  System.out.println(" 2. Calculator for the area of the Triangle ");
  System.out.println(" 3. Calculator for the area of the Pentagon ");
  System.out.println("***Enter an option***");
  opcion = input.nextInt();
  switch (opcion){
  
    case 1:
         
         System.out.println("Enter radius");
         int radio = input.nextInt();
         System.out.println(" THE AREA OF THE CIRCLE IS :"+ areaCirculo(radio));
        break;
        
    case 2:
         System.out.println("Enter base ");
         int base = input.nextInt();
         System.out.println(" Enter height ");
         int altura = input.nextInt();
         System.out.println(" THE AREA OF THE TRIANGLE IS :"+areatriangulo(base,altura));
        break;

    
    case 3:
         System.out.println(" Enter the perimeter");
         int perimetro = input.nextInt();
         System.out.println("Enter the Apothem");
         int apotema= input.nextInt();
         System.out.println(" THE PENTAGON AREA IS:"+areapentagono(perimetro,apotema));
        break;
      
       }
        System.out.println("*** Good Bye User***");
  }while(opcion!=3);
 }

    private static String areaCirculo(int radio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String areatriangulo(int base, int altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String areapentagono(int perimetro, int apotema) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
 {  
}
   

    
  

    
    
    
    