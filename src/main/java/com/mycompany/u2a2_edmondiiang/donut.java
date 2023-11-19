/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2_edmondiiang;

/**
 *
 * @author edmon
 */
public class donut extends shape 
{   
    private static final String NAME = "Donut"; 
    
    protected double innerRadius;
    
    protected double outerRadius;
    
    public donut(double _outerRadius, double _innerRadius, double _cost, int _id)
    {
        
        super(NAME, _cost, _id);
        
        innerRadius = _innerRadius;
        
        outerRadius = _outerRadius;

    }

    @Override
    public double getArea() 
    {

        double entireCircleArea = outerRadius * Math.PI * outerRadius;
        
        double innerCircleArea = innerRadius *  Math.PI * innerRadius;
        
        double area = entireCircleArea - innerCircleArea;
        
        return area;
    }
}