/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double base;
       double porcentaje;
       double total;
       double IVA;
       
       Scanner input = new Scanner(System.in);
       CalculateIVA calculating = new CalculateIVA();
       
       System.out.println("Welcome to Calculator to IVA");
       System.out.println("My name is Evelyn");
       System.out.println("Enter base");
       base = input.nextDouble();
 
       System.out.println("Enter porcentaje to IVA");
       porcentaje = input.nextDouble();
       IVA = calculating.ObtainIva(base, porcentaje);
       total = base + IVA;
 
       System.err.println("Base: " + base);
       System.err.println("IVA: " + IVA);
       System.err.println("Total: " + total);
       System.out.println("BYE USER");

    }
    
    private static class CalculateIVA {

        public CalculateIVA() {
        }

        private double ObtainIva(double base, double porcentaje) {
            return 0.12;
       }
        static {    
       double valor;
       double porcentaje;
       double total;
       double ISD;
       Scanner input = new Scanner(System.in);
       CalculateISD  calculating = new CalculateISD ();
       
       System.out.println("Welcome to Calculator to ISD");
       System.out.println("My name is Evelyn");
       System.out.println("Enter to valor");
       valor = input.nextDouble();
 
       System.out.println("Enter porcentaje to ISD");
       porcentaje = (int) input.nextDouble();
       ISD = calculating.ObtainISD(valor, porcentaje);
       total = valor + ISD;
       
       System.err.println("Base: " + valor);
       System.err.println("ISD: " + ISD);
       System.err.println("Total: " + total);
  
    }
    private static class CalculateISD  {

        public CalculateISD () {
        }

        private double ObtainISD(double base, double porcentaje) {
            return 0.015;
            
           }
       }
       { 
        System.out.println("My name is Evelyn");
        double tax = 0, it;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Enter income ----- ");
        it = sc.nextDouble();
        if (it <= 200000) {
            tax = 0;
        } else if (it <= 300000) {
            tax = 0.1 * (it - 200000);
        } else if (it <= 500000) {
            tax = (0.2 * (it - 300000)) + (0.1 * 100000);
        } else if (it <= 1000000) {
            tax = (0.3 * (it - 500000)) + (0.2 * 200000) + (0.1 * 100000);
        } else {
            tax = (0.4 * (it - 1000000)) + (0.3 * 500000)
       
                   + (0.2 * 200000) + (0.1 * 100000);
            
        System.out.println("Income tax amount is  " + tax);
        
    }
}










   