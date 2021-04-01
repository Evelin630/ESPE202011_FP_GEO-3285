/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.controller;

import ec.edu.espe.farmsystem.model.Horse;
import java.io.FileReader;
import utils.FileManager;

/**
 *
 * @author Sony
 */
public class HorseController {
    
    public void save(Horse horse){
        
        String data = horse.getName() + ";" + horse.getColor() + ";" + horse.getAge() + ";" + horse.getScientificname() + ";" + horse.getWeight();
        FileManager.save(data, "horse");
        
    }    
     public String read(){
         String data;
         data = FileManager.read("horses");
         return data;
         
         
        
    }
     

       
   }
   
  
  
  


