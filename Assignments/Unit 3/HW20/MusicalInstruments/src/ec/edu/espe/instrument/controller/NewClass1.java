/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.instrument.controller;

/**
 *
 * @author Sony
 */
public class NewClass1 {
      
    public int[] sorByBubbleSort(int[] instruments){
   
         int n = instruments.length;
         int temp;
        
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (instruments[j] > instruments[j + 1]) {
                
                    temp = instruments[j];
                    instruments[j] = instruments[j + 1];
                    instruments[j + 1] = temp;
                }
               
                
            }
           
        }
    return instruments;
    
}
}
