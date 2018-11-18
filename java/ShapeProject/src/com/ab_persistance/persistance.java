
package com.ab_persistance;

 
abstract  class  persistance {
    int number=10;
   
    abstract void persist(int x,int y);
    
    public static void main(String args[]){
      FilePersistance persistance=new FilePersistance();
       
       persistance.persist(10, 20);
    }

    
    
}
