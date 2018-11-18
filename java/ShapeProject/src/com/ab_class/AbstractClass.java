package com.ab_Class;

public abstract class AbstractClass {
	public int average(int num1,int num2){
		//int num1,num2,
		int average;
		
		average=(num1+num2)/2;
		return average;
		
	}
	//definition of abstract method
	public  abstract void result(int num1,int num2);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("average="   +ab.average(10, 20));
		

	}

}
