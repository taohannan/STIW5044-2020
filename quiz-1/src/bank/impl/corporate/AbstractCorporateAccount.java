package bank.impl.corporate;

import Domain.Corporation;
import bank.BankAcc;

public abstract class AbstractCorporateAccount implements BankAcc {
    String accNo;
    Double balanceAcc;

    public AbstractCorporateAccount(String accNo, Double balanceAcc) {
        this.accNo = accNo;

        this.balanceAcc = balanceAcc;
    }

    @Override
    public abstract void doWithdrawal(Double amount);

    @Override
    public Double getAccBalance() {
        return this.balanceAcc;
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
