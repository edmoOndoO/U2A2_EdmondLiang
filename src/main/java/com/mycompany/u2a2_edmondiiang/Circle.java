/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2_edmondiiang;

/**
 *
 * @author edmon
 */
    public class Circle extends shape 
{   
    protected double radius;
    private static final String NAME = "Circle"; 
    
    public Circle(double _cost, double _radius, int _id)
    {
        super(NAME, _cost, _id);
        
        radius = _radius;
    }

    @Override
    public double getArea() 
    {
        // area of the shape
        double area = radius * Math.PI * radius;
        
        return area;
    }
}
    

