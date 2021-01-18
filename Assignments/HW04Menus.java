package hw.pkg04menus;


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 import java.util.Scanner;

/**
 *
 * @author Sony
 */
 public class Menus{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator of area =======");
            System.out.println("1. -> Square area");
            System.out.println("2. -> triangle area");
            System.out.println("3. -> Rectangle area");
            System.out.println("4. -> Exit");
            
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
            
            case 1;
            
            int base;
            int heigh;
            int area;
            System.out.println("enter base -> ");
            base = input.nextInt();
            System.out.println("Enter heigh ->");
            heigh = input.nextInt();
            area= base * heigh;
            System.out.println("The area is  -->" + area);
            
            case 2;
            
            int base1;
            int heigh1;
            int area1;
            System.out.println("enter base1 -> ");
            base = input.nextInt();
            System.out.println("Enter heigh1 ->");
             heigh = input.nextInt();
             area1= base1 * heigh1 /2;
            System.out.println("The area is1  -->" + area1);
            
            case 3;
            
            int perimeter;
            int base2;
            int area2;
            System.out.println("enter perimeter -> ");
            base = input.nextInt();
            System.out.println("Enter base2 ->");
            base2 = input.nextInt();
            area2 = (perimeter * base2)/2 ;
            System.out.println("The area is2 -->" + area2);
            
            
            case 4;
            System.out.println("Good Bye my friend");
                    System.exit(0);
            
           
            
                    
                    
                    
            
                    
                    
                    
            
                    
            }


    
}
