/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2_edmondiiang;

/**
 *
 * @author edmon
 */
public abstract class shape {
    
    public int id;
    
    public String name;
    
    public double cost;
    
    public abstract double getArea(); 
    
    // Since each form has a unique technique for obtaining the area, the abstract approach for the area
    
    public shape(String _name, double _cost, int _id)
    {
        name = _name;
        
        cost = _cost;
        
        id = _id;
    }
    
    public double totalCost() 
    {
        return cost * getArea();
    }
    
    @Override 
    
    public String toString()
            
    {
        return id + "| Name: " + name + ", Cost/sq meter: $" + cost + ", Total Cost: $" + totalCost();
        
    }
}
