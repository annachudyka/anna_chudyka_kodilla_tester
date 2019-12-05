package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;



    public Bank() {


        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();

        this.cashMachines=new CashMachine[]{cashMachine,cashMachine1,cashMachine2,cashMachine3};

    }

    public int getTotalBalance() {
        int total = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            total += cashMachines[i].getBalance();
        }
        return total;

    }

    public CashMachine[] getCashMachines(int x){
        return cashMachines;
    }

    public double getAverageOfWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        if (cashMachine.getTransactions().length == 0) {
            return 0;
        }
        double withdrawal = 0;
        int i;
        for (i = 0; i < cashMachine.getTransactions().length; i++) {
            if (cashMachine.getTransactions()[i]<0) {
                withdrawal += cashMachine.getTransactions()[i];
            }
        }
        return withdrawal /cashMachine.getTransactions().length;
    }

    public double getAverageOfPayment(){
        CashMachine cashMachine=new CashMachine();
        if(cashMachine.getTransactions().length==0){
            return 0;
        }
        double payment=0;
        int i;
        for(i=0;i<cashMachine.getTransactions().length;i++) {
            if (cashMachine.getTransactions()[i] > 0) ;{
                payment += cashMachine.getTransactions()[i];
            }
        }
        return payment/cashMachine.getTransactions().length;
    }

    public int countNumberOfPayments() {
        CashMachine cashMachine=new CashMachine();
        if (cashMachine.getTransactions().length == 0) {
            return 0;
        }
        int numberOfPayments=0;
        for (int i = 0; i < cashMachine.getTransactions().length; i++) {
            if (cashMachine.getTransactions()[i]> 0) {
                numberOfPayments += cashMachine.getTransactions()[i];
            }
        }
        return numberOfPayments;
    }

    public int countNumberOfWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        if (cashMachine.getTransactions().length == 0) {
            return 0;
        }
        int numberOfWithdrawals = 0;
        for (int i = 0; i < cashMachine.getTransactions().length; i++) {
            if (cashMachine.getTransactions()[i] < 0) {
                numberOfWithdrawals += cashMachine.getTransactions()[i];
            }
        }
        return numberOfWithdrawals;
    }

}






