/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2_edmondiiang;

/**
 *
 * @author edmon
 */
public class triangle extends shape 
{   
    private static final String NAME = "Triangle"; 
    
    protected double base;
    
    protected double height;
    
    public triangle(double _base, double _height, double _cost, int _id)
    {
        
        super(NAME, _cost, _id);
        
        base = _base;
        
        height = _height;
        
    }

    @Override
    
    public double getArea() 
    {
        
        double area = (base * height) / 2;
        
        return area;
    }
}