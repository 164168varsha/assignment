package com.ab_Class;

public class abstract_subclass extends AbstractClass{

	@Override
	// it's a abstract method
	 public void result(int num1,int num2 ) {
		
		if(num1>num2){
			System.out.println("num1 is greater");
			
		}
		System.out.println("num2 is grater");
		
	}
	//it's a overided method
	public int average(int num1,int num2){
		
		int average;
		
		average=(num1+num2)/2;
		return average;
		
	}
	public static void main(String[] args) {
		abstract_subclass absubclass=new abstract_subclass();
		
		System.out.println("average=" +absubclass.average(10,20));
		absubclass.result(10, 20);
	}
	

}
