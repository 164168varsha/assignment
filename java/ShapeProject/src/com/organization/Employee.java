package com.organization;

import java.util.Scanner;



public class Employee {
	
	public  void testLabour(){
		Labour lbr=new Labour();
		lbr.cal(60,40000);
		

	}
	public void testManager(){
		Manager mgr=new Manager();
		mgr.cal(60000);
		
	}

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.testLabour();
		emp.testManager();

   } 

}
