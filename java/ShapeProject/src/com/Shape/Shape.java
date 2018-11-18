
package com.Shape;


public class Shape {

    public void lining(){
        Line ln=new Line(1,1,2,2);
        
    }
    public void rectangling(){
        Rectangle rectangle =new Rectangle();
        System.out.println("----for rectangle----");
        rectangle.cal(10,20);
        
    }
    public void cubing(){
        Cube cube=new Cube();
        System.out.println("----for cube----");
        cube.cal(10);
    }
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.lining();
        shape.rectangling();
        shape.cubing();
        // TODO code application logic here
    }
    
}
