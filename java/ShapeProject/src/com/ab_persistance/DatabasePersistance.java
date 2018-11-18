
package com.ab_persistance;


abstract class DatabasePersistance  extends persistance{

  
    public void persist(int x,int y){
        System.out.println("abstract class");
        System.out.println("number1=" +x);
       System.out.println("number2=" +y); 
    }
}
