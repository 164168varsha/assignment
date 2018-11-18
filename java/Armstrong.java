package corejava;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int  number ,remainder=0, temp ,sum=0;
	System.out.println("enter the number");
	number=scanner.nextInt();
	temp=number;
	while(number>0){
		remainder=number%10;
		number=number/10;
		sum=sum+(remainder*remainder*remainder);
	}if(temp==sum){
		System.out.println("armstrong number");
	}else{
		System.out.println("Not armstrong number");
	}
	
}
}
