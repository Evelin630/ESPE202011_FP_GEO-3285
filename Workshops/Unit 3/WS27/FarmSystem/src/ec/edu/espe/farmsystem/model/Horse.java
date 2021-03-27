/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.model;

/**
 *
 * @author Sony
 */
public class Horse {
    
    private String name;
    private String color;
    private String Scientificname;
    private int age;
    private float Weight;

    public Horse(String name, String color, String Scientificname, int age, float Weight) {
        this.name = name;
        this.color = color;
        this.Scientificname = Scientificname;
        this.age = age;
        this.Weight = Weight;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the Scientificname
     */
    public String getScientificname() {
        return Scientificname;
    }

    /**
     * @param Scientificname the Scientificname to set
     */
    public void setScientificname(String Scientificname) {
        this.Scientificname = Scientificname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the Weight
     */
    public float getWeight() {
        return Weight;
    }

    /**
     * @param Weight the Weight to set
     */
    public void setWeight(float Weight) {
        this.Weight = Weight;
    }
    
    
    
    
    
    
}
