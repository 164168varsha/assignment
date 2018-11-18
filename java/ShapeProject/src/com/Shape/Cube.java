
package com.Shape;


public class Cube extends Shape{
    double side;
    public Cube() {
        
    }
    public void cal(double side){
        double area;
        area=6*(side*side);
        System.out.println("area=" +area);
        double perimeter=(side*side*side);
        System.out.println("perimetr=" +perimeter);
    }
    
    
}
