package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength(){
        CashMachine cashMachine=new CashMachine();
        int[]transactions=cashMachine.getTransactions();
        assertEquals(0,transactions.length);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-50);
        cashMachine.add(100);
        int[]transactions=cashMachine.getTransactions();
        assertEquals(2,transactions.length);
        assertEquals(-50,transactions[0]);
        assertEquals(100,transactions[1]);
    }
    @Test
    public void shouldCalculateBalance(){
        CashMachine cashMachine=new CashMachine();
        cashMachine.add(150);
        cashMachine.add(-50);
        cashMachine.add(-100);
        int balance=cashMachine.getBalance();
        assertEquals(0,balance);
    }
    @Test
    public void shouldCalculateAverageOfPayment(){
        CashMachine cashMachine=new CashMachine();
        cashMachine.add(100);
        cashMachine.add(50);
        cashMachine.add((50));
        assertEquals(66.67,cashMachine.getAverageOfPayment(),0.01);
    }
    @Test
    public void shouldCalculateAverageOfWithdrawal(){
        CashMachine cashMachine=new CashMachine();
        cashMachine.add(-100);
        cashMachine.add(-50);
        cashMachine.add(-200);
        assertEquals(-116.67,cashMachine.getAverageOfWithdrawal(),0.01);

    }
    @Test
    public void shouldCalculateNumberOfPayments(){
        CashMachine cashMachine=new CashMachine();
        cashMachine.add(200);
        cashMachine.add(100);
        cashMachine.add(50);
        int[]transactions=cashMachine.getTransactions();
        assertEquals(3,cashMachine.countNumberOfPayments());
    }
    @Test
    public void sholudCalculateNumberOfWithdrawals(){
        CashMachine cashMachine=new CashMachine();
        cashMachine.add(-50);
        cashMachine.add(-50);
        int[]transactions=cashMachine.getTransactions();
        assertEquals(-100,cashMachine.countNumberOfWithdrawal());
    }
}
