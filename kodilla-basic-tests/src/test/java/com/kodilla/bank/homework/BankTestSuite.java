package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite{

    @Test
    public void shouldCalculateTotalBalance(){

        Bank bank =new Bank();
        bank.getCashMachines(150);
        bank.getCashMachines(-50);
        bank.getCashMachines(50);
        bank.getCashMachines(-150);
        assertEquals(0,bank.getTotalBalance());
    }
    @Test
    public void shouldCalculateAverageOfPayment(){
        CashMachine cashMachine=new CashMachine();
        Bank bank=new Bank();
        cashMachine.add(100);
        cashMachine.add(50);
        cashMachine.add((50));
        assertEquals(66.67,bank.getAverageOfPayment(),0.01);
    }
    @Test
    public void shouldCalculateAverageOfWithdrawal(){
        CashMachine cashMachine=new CashMachine();
        Bank bank=new Bank();
        cashMachine.add(-100);
        cashMachine.add(-50);
        cashMachine.add(-200);
        assertEquals(-116.67,bank.getAverageOfWithdrawal(),0.01);
    }

    @Test
    public void shouldCalculateNumberOfPayments(){
        CashMachine cashMachine=new CashMachine();
        Bank bank=new Bank();
        cashMachine.add(200);
        cashMachine.add(100);
        cashMachine.add(50);
        int[]transactions=cashMachine.getTransactions();
        assertEquals(3,bank.countNumberOfPayments());
    }

    @Test
    public void shouldCalculateNumberOfWithdrawals(){
        CashMachine cashMachine=new CashMachine();
        Bank bank=new Bank();
        cashMachine.add(-50);
        cashMachine.add(-50);
        int[]transactions=cashMachine.getTransactions();
        assertEquals(2,bank.getAverageOfWithdrawal());
    }


}
