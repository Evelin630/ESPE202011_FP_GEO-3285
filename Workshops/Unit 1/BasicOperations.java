/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Sony
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int sum;
    int addend1;
    int addend2;
    int minuend;
    int subtrahend;
    int product;
    int multiplicant;
    int multiplier;
    int dividend;
    int divisor;
    int quotient;
    int remanider;
  
    addend1 = 5;
    addend2 = 18;
    minuend = -23;
    subtrahend = -6;
    multiplicant =8;
    multiplier = 10;
    dividend =15;
    divisor = 9;
    
    sum = addend1 + addend2;
    
    System.out.println("the addition of " + addend1 + " + " + addend2 
            + " is equal tc -->" + sum);
    ++sum;
    System.out.println("sum is equal  tc -->" + sum);
    
    ++sum;
    System.out.println("sum is equal  tc -->" + sum);
    
    System.out.println("adding one to sum" + (sum++));
    
    System.out.println("adding one to sum" + ((sum++)));
    
    System.out.println("the substraction of" + minuend + "-" + subtrahend
            + "is equal to" + (minuend - subtrahend));
    
    product = multiplier + multiplicant; 
    
     System.out.println("the multiplication of " + multiplier + "*" 
            + multiplicant + " is equal to -->" + product);
    
     System.out.println("the substraction of" + minuend + "-" + subtrahend
            + "is equal to" + (minuend - subtrahend)); 
             
    product = multiplier * multiplicant; 
    
    System.out.println("the multiplication of " + multiplier + "*" 
            + multiplicant + " is equal to -->" + product);
    quotient = dividend / divisor;
    
    System.out.println("the divisor of" + dividend + "/" + divisor 
            + " is equal to -->" + quotient);
    
    remanider = dividend % divisor;
    
    System.out.println("the divisor remanider of" + dividend + "%" + divisor 
            + " is equal to -->" + remanider);           
}
