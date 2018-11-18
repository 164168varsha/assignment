
package com.bankaccount;


public class SavingAccount extends BankAccount{
 double FixedDeposit ,salary ;

    public SavingAccount(double salary,double FixedDeposit) {
        salary=this.salary;
        FixedDeposit=this.FixedDeposit;
    
    }

    
    public void cal(){
        salary= salary+FixedDeposit;
        System.out.println("salary=" +salary);
       
        
        
        
    }
    
}
