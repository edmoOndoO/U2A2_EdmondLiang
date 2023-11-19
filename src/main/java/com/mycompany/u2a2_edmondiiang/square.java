/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2_edmondiiang;

/**
 *
 * @author edmon
 */
public class square extends shape 
{   
    private static final String NAME = "Square"; 
    
    protected double length;
    
    public square(double _length, double _cost, int _id)
    {
        super(NAME, _cost, _id);
        
        length = _length;
    }

    @Override
    
    public double getArea() 
    {
        double area = length * length;
        
        return area;
        
    }
}