package com.kodilla.bank.homework;

public class CashMachine {

    private int[]transactions;
    private int size;

    public CashMachine(){
        this.transactions=new int[0];
        this.size=0;
    }
    public int[]getTransactions(){
        return transactions;
    }
    public void add(int transaction){
        this.size=size+1;
        int[]newTab=new int[this.size];
        System.arraycopy(transactions,0,newTab,transactions.length,0);
        newTab[this.size-1]=transaction;
        this.transactions=newTab;
    }
    public int getBalance(){
        if(this.transactions.length==0){
            return 0;
        }
        int balance=0;
        int i;
        for(i=0;i<transactions.length;i++){
            balance+=this.transactions[i];
        }
        return balance;
    }
    public double getAverageOfPayment(){
        if(this.transactions.length==0){
            return 0;
        }
        double payment=0;
        int i;
        for(i=0;i<transactions.length;i++){
            if(this.transactions[i]>0);
            payment+=this.transactions[i];
        }
        return payment/transactions.length;
    }
    public double getAverageOfWithdrawal(){
        if(this.transactions.length==0){
            return 0;
        }
        double withdrawal=0;
        int i;
        for(i=0;i<transactions.length; i++){
            if(this.transactions[i]<0);
            withdrawal+=this.transactions[i];
        }
        return withdrawal/transactions.length;
    }
    public int countNumberOfPayments() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int numberOfPayments=0;
        for (int i = 0; i < transactions.length; i++) {
            if (this.transactions[i] > 0) ;
            numberOfPayments = transactions.length;
        }
        return numberOfPayments;
    }

    public int countNumberOfWithdrawal(){
        if(this.transactions.length==0){
            return 0;
        }
        int numberOfWithdrawals=0;
        for(int i=0;i<transactions.length;i++){
            if(this.transactions[i]<0);
            numberOfWithdrawals=transactions.length;
        }
        return numberOfWithdrawals;
    }





}
