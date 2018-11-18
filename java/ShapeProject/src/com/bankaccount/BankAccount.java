
package com.bankaccount;

import jdk.nashorn.internal.objects.annotations.Getter;


public class BankAccount {

    public BankAccount() {
       
    }
    
    public void saving(){
        SavingAccount savingacc =new SavingAccount(40000,2000);
        savingacc.cal();
        
    }
    public void current() {
        CurrentAccount currentacc =new CurrentAccount();
        currentacc.cal();
        
    }
    public static  void  main(String args[]){
       BankAccount bankacc =new BankAccount();
       bankacc.saving();
       bankacc.current();
    }
    
}
