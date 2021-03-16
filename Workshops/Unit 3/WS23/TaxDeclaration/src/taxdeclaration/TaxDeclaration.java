/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclaration;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float ivaValue;
        float totalPrice;
        final float ivaPercentage = 12;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("====Evelyn Sanchez Taxes====");
        System.out.print("IVA -->");
        System.out.print("Enter the price of your products");
        
    price = input.nextFloat();
         
        ivaValue=BasicTax.computeIva(price, ivaPercentage);
        totalPrice= price + ivaValue;
        
        System.out.println("total price--" + totalPrice);
       
    }
    
}            
   