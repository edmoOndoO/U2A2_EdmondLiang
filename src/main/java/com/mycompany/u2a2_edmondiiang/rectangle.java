/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2_edmondiiang;

/**
 *
 * @author edmon
 */
public class rectangle extends shape 
{   
    private static final String NAME = "Rectangle"; 
    
    protected double length;
    
    protected double width;
    
    public rectangle(double _length, double _width, double _cost, int _id)
    {
        
        super(NAME, _cost, _id);
        
        length = _length;
        
        width = _width;
    }

    @Override
    
    public double getArea() 
    {

        double area = length * width;
        
        return area;
    }
}