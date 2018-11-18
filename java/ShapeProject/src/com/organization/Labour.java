package com.organization;

import java.util.Scanner;

public class Labour extends Employee{
		
		 
		public Labour() {
			// TODO Auto-generated constructor stub
		}Labour(double salary,double overtime){
			
			
		}
		public void cal(int month_hour,int salary){
			Scanner sc=new Scanner(System.in);
			 int Overtime;
			System.out.println("enter overtime you have worked=" );
			Overtime = sc.nextInt();
			//int month_hour;
			System.out.println("monthly hour=" +month_hour);
			
		 
			salary=salary+((Overtime*salary)/month_hour);
			System.out.println("total salary=" +salary);
		}
}
