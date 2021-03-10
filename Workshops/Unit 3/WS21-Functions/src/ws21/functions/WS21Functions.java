/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.functions;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
    System.out.println("Autor Evelyn Sanchez");
                        
    Scanner input = new Scanner(System.in);
     
    
     
     int electricConsumption;
     int wats = 80;
     int hours = 24;
     int days;
     float consumption;
     
     
     System.out.print("Insert ElectricConsumption ->");
     days = input.nextInt();
   
     
     electricConsumption = calculateConsumption(wats, hours, days);
     System.out.println("Total consumption is" + electricConsumption);
    }

    public static int calculateConsumption(int wats, int hours, int days) {
        int electricConsumption;
        electricConsumption = (wats * hours * days);
        return electricConsumption;
        
        }
        
        static {
        
    
            
    Scanner input = new Scanner(System.in);
    
     int Storagecapacity = 100;
     int Vegetables = 16;
     int Meats = 12;
     int Others;
     float Totalstorage;
    
        
     System.out.print("Insert Storage->");
     Others = input.nextInt();
   
     
     Totalstorage = calculateTotalstorage(Vegetables, Meats, Others);
     System.out.println("Total storage is" + Storagecapacity);
     
     }
        
    
     public static int calculateTotalstorage(int Vegetables, int Meats, int Others) {
        int Storagecapacity;
        Storagecapacity = (Vegetables * Meats * Others);
        return Storagecapacity;
        
     
    }
    }
    
