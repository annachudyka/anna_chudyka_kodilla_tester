package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine(){
        this.transactions=new int[0];
        this.size=0;
    }
    public int[] getTransactions(){
        return transactions;
    }
    public void add(int transaction){
        this.size=size+1;
        int[]newTab=new int[this.size];
        System.arraycopy(transactions,0,newTab,0,transactions.length);
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
}
