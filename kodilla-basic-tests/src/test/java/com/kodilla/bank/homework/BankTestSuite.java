package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite{

    @Test
    public void shouldCalculateTotalBalance(){
        Bank bank =new Bank();
        CashMachine[]cashMachines=bank.getCashMachines();
        cashMachines[0].add(100);
        cashMachines[1].add(-50);
        cashMachines[2].add(100);
        cashMachines[3].add(-20);
        assertEquals(180,bank.getTotalBalance());
    }
    @Test
    public void shouldCalculateAverageOfPayment(){
        Bank bank=new Bank();
        CashMachine[]cashMachines=bank.getCashMachines();
        cashMachines[0].add(100);
        cashMachines[0].add(50);
        cashMachines[0].add((50));
        assertEquals(66.67,bank.getAverageOfPayment(cashMachines[0]),0.01);
    }
    @Test
    public void shouldCalculateAverageOfWithdrawal(){
        Bank bank=new Bank();
        CashMachine[]cashMachines=bank.getCashMachines();
        cashMachines[0].add(-100);
        cashMachines[0].add(-50);
        cashMachines[0].add(-200);
        assertEquals(-116.67,bank.getAverageOfWithdrawal(cashMachines[0]),0.01);
    }
    @Test
    public void shouldCalculateNumberOfPayments(){
        Bank bank=new Bank();
        CashMachine[]cashMachines=bank.getCashMachines();
        cashMachines[0].add(200);
        cashMachines[0].add(100);
        cashMachines[0].add(50);
        assertEquals(3,bank.countNumberOfPayments(cashMachines[0]));
    }
    @Test
    public void shouldCalculateNumberOfWithdrawals(){
        Bank bank=new Bank();
        CashMachine[] cashMachines=bank.getCashMachines();
        cashMachines[0].add(-50);
        cashMachines[0].add(-50);
        assertEquals(2,bank.countNumberOfWithdrawal(cashMachines[0]));
    }
}
