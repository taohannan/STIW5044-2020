package bank.impl;

import Domain.User;
import bank.BankAcc;

public abstract class AbstractRetailAcc implements BankAcc {

    String accNo;
    User userDetails;
    Double balanceAcc;

    public AbstractRetailAcc(String accNo, User userDetails,Double balanceAcc) {
        this.accNo = accNo;
        this.userDetails = userDetails;
        this.balanceAcc = balanceAcc;
    }

    @Override
    public abstract Double doWithdrawal(Double amount) ;

    @Override
    public Double getAccBalance() {
        return balanceAcc;
    }

    @Override
    public abstract Double doDeposit(Double amount) ;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public User getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(User userDetails) {
        this.userDetails = userDetails;
    }

    public Double getBalanceAcc() {
        return balanceAcc;
    }

    public void setBalanceAcc(Double balanceAcc) {
        this.balanceAcc = balanceAcc;
    }
}
