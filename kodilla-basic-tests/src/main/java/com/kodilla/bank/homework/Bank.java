package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[]cashMachines;

    public int getBalanceAverage(CashMachine[] cashMachines) {
        int average = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            average += cashMachines[i].getBalance();
            }
        average/=cashMachines.length;
        return average;

        }

    }



