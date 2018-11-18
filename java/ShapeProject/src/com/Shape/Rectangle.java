
package com.Shape;


public class Rectangle extends Shape{
int length,breadth,Area;
    public Rectangle() {
            
          
        
    }
    public void cal(int length,int breadth){
    
            Area=length*breadth;
        System.out.println("area=" +Area);
          int perimeter;
          perimeter=2*(length+breadth);
          System.out.println("perimeter="  +perimeter);
    }

  
    
    
}
