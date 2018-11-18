package corejava;

import java.util.Scanner;

public class Arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int a[]=new int[5];
		int i,search;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array number=");
		for(i=0;i<a.length;i++){
		
		    a[i]=sc.nextInt();
		}
		System.out.println("enter the no to search");
		search = sc.nextInt();
		
		for(i=0;i<a.length;i++){
			while(search == a[i]){
				System.out.println(i);
				break;
				
			
			}
		}
				
				 
			}
	
		}

 
		
		
		
		
		
	


