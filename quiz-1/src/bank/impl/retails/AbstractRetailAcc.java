package bank.impl.retails;

import bank.BankAcc;

public abstract class AbstractRetailAcc implements BankAcc {

    String accNo;
    Double balanceAcc;

    public AbstractRetailAcc(String accNo,Double balanceAcc) {
        this.accNo = accNo;
        this.balanceAcc = balanceAcc;
    }

    @Override
    public abstract void doWithdrawal(Double amount) ;

    @Override
    public Double getAccBalance() {
        return balanceAcc;
    }

    @Override
    public abstract void doDeposit(Double amount) ;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }


    public Double getBalanceAcc() {
        return balanceAcc;
    }

    public void setBalanceAcc(Double balanceAcc) {
        this.balanceAcc = balanceAcc;
    }
}
