package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite{

    @Test
    public void shouldCalculateTotalBalance(){

        Bank bank =new Bank();
        bank.addTransactionToCashMachine(150);
        bank.addTransactionToCashMachine1(-50);
        bank.addTransactionToCashMachine2(100);
        bank.addTransactionToCashMachine3(-20);
        assertEquals(180,bank.getTotalBalance());
    }
    @Test
    public void shouldCalculateAverageOfPayment(){
        CashMachine cashMachine=new CashMachine();
        Bank bank=new Bank();
        cashMachine.add(100);
        cashMachine.add(50);
        cashMachine.add((50));
        assertEquals(66.67,bank.getAverageOfPayment(cashMachine),0.01);
    }
    @Test
    public void shouldCalculateAverageOfWithdrawal(){
        CashMachine cashMachine=new CashMachine();
        Bank bank=new Bank();
        cashMachine.add(-100);
        cashMachine.add(-50);
        cashMachine.add(-200);
        assertEquals(-116.67,bank.getAverageOfWithdrawal(cashMachine),0.01);
    }

    @Test
    public void shouldCalculateNumberOfPayments(){
        CashMachine cashMachine=new CashMachine();
        Bank bank=new Bank();
        cashMachine.add(200);
        cashMachine.add(100);
        cashMachine.add(50);
        int[]transactions=cashMachine.getTransactions();
        assertEquals(3,bank.countNumberOfPayments(cashMachine));
    }

    @Test
    public void shouldCalculateNumberOfWithdrawals(){
        CashMachine cashMachine=new CashMachine();
        Bank bank=new Bank();
        cashMachine.add(-50);
        cashMachine.add(-50);
        int[]transactions=cashMachine.getTransactions();
        assertEquals(2,bank.countNumberOfWithdrawal(cashMachine));
    }


}
