/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2_edmondiiang;

/**
 *
 * @author edmon
 */
public class hexagon extends shape 
{   
    
    private static final String NAME = "Hexagon"; 
    
    protected double length;
    
    public hexagon(double _length, double _cost, int _id)
    {
        super(NAME, _cost, _id);
        
        length = _length;
    }

    @Override
    
    public double getArea() 
    {
        return (6 * (length * length)) / (4 * Math.tan(Math.PI / 6));
    }
}