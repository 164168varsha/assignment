package corejava;

import java.util.Scanner;

public class Interest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n,principal,rate,SI;
	double CI;
	System.out.println("enter the years");
	n= scanner.nextInt();
	System.out.println("enter the principal");
	principal= scanner.nextInt();
	System.out.println("enter the rate");
	rate= scanner.nextInt();
	SI=(principal*rate*n)/100;
	
	
	CI= principal *(Math.pow((1+rate/100),n));
	System.out.println("Simple interest=" +SI);
	System.out.println("Compound Interest=" +CI);
	
	
}


}
