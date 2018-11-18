package com.varsha.bank;  //collection of logical classes

import java.util.Scanner;

public class bankAccount {
	//static variables
	private static int autoAccountNo;
	
	//instance variable 
   private int accountNo;
   private String accountHolderName;
   private double accountBalance;
   //init block
   {
	   accountNo=++autoAccountNo;                       //to remove redundancy in program
      }
   //constructor overloading
 //default constructor
   public bankAccount(){            
	  
	   accountHolderName="Unknown";
	   accountBalance=0;
	   
    }
   
 //parameterized constructor
   public bankAccount(String accountHolderName,double accountBalance){           
	  
	  
	   this.accountHolderName=accountHolderName;
	   this.accountBalance=accountBalance;
	   
      }
   
   // modify / reinitialize member variable
   public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
   }
    public double getAccountBalance() {						//getter methods
		return accountBalance;
	}
    public String getAccountHolderName() {
		return accountHolderName;
	}
    public int getAccountNo() {
		return accountNo;
	}
    public void withdraw(double amount){						 //service methods
    	
          while(accountBalance>1000){
    	if(amount<=0 || amount > accountBalance || accountBalance == 1000){
    		System.out.println("invalid amount");
    	}else{
    	this.accountBalance=accountBalance - amount;	
    	}
    	System.out.println(accountBalance);
          }	
    }
    public void deposit(double amount){
    	
    	if(amount <= 0){
    		System.out.println("invalid amount");
    	}else{
    	this.accountBalance=accountBalance + amount;
    }System.out.println(accountBalance);
    }
    
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	bankAccount acc =new bankAccount("onkar",5000);
	bankAccount acc1=new bankAccount();
	double amount;
	
	
	System.out.println("enter amount");
	amount=sc.nextDouble(); 
	acc.withdraw(amount);
	acc.withdraw(amount);
	double depositamt;
	System.out.println("enter amount to deposit");
	depositamt=sc.nextDouble();

	
     } 
  }
