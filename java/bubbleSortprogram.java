package corejava;

import java.util.Scanner;

public class bubbleSortprogram {
public static void main(String[] args) {
	int a[]= new int[5];
	int i,search;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the array number=");
	for(i=0;i<a.length;i++){
	
	    a[i]=sc.nextInt();
	}
	
	for(i=0;i<a.length;i++){
		for(int j=i;j<a.length;j++){
			
		
		int temp;
		if(a[i]>a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	}System.out.println("\n array in sorted order");
	for(i=0;i<a.length;i++){
	System.out.print(a[i] +",");			
}
}
}
