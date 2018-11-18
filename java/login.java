package corejava;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String user, pwd;
		 int count=0;
		 while(count<=3){
		System.out.println("enter username :");
		user= sc.nextLine();
		System.out.println("enter pwd :");
		pwd= sc.nextLine();
		
    	 if(user.equals("abc") && pwd.equals("abc@123")){
    		 
    	 System.out.println("welcome");
    	 break;
    	 } else{
    		
    		 System.out.println("invalid username or password");
    		
    	 } count++;
         
     }System.out.println("contact admin");

   
	}

}
