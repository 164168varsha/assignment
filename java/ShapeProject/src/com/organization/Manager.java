package com.organization;

import java.util.Scanner;

public class Manager extends Employee {
		//double incentive=20000;
	public void cal(int salary){
		Scanner sc= new Scanner(System.in);
		int incentives;
		//int salary;
		
		System.out.println("enter incentives given to manager=" );
		incentives=sc.nextInt();
		salary =salary+incentives;
		System.out.println("total salary given to mgr=" +salary);
		
	}
}
