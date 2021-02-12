/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hs13;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class HS13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner input = new Scanner(System.in);
        String leave = "";
        while (!leave.equalsIgnoreCase("Leave")) {
            System.out.println(" ***HELLO*** ");
            System.out.println("*** My Name is Evelyn***");
            System.out.println("*****");
            System.out.println("*** MENU ***");
            System.out.println("1.Displacement Formula");
            System.out.println("2. Launch Up");
            System.out.println("3. Acceleration");
            System.out.println("Leave");
            System.out.println("*****");
          String Leave = input.nextLine();
 
            if (leave.equals("1")) {
                System.out.println(" ");
                System.out.println("Displacement Formula");
                System.out.println("Formula: x = vo*t + 1/2 a * t^2 ");
                System.out.println("Login vo");
                double vo = input.nextDouble();
                System.out.println("Login t");
                double t = input.nextDouble();
                System.out.println("Login a");
                double a = input.nextDouble();
                double resultado = ((vo * t) + (a / 2) * (t * t));
                System.out.println(" ");
                System.out.println("** ANSWER****");
                System.out.println("x = " + vo + "*" + t + " + 1/2 *" + a + " * " + t + "^2");
                System.out.println("x = " + resultado);
                System.out.println("******");
 
            } else if (leave.equals("2")) {
                System.out.println("Scroll Up Formula");
                System.out.println("Formula: Vf = Vo - g*t");
            } else if (leave.equals("3")) {
                System.out.println("Acceleration Formula");
                System.out.println("dv = vf – vi");
            }
        }
        
    
    }
}
        
    }
    }
    
}
