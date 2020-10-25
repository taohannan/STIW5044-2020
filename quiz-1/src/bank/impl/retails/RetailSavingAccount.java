package bank.impl.retails;

import Domain.User;

public class SavingAccount extends AbstractRetailAcc {


    public SavingAccount(String accNo, User userDetails, Double balanceAcc) {
        super(accNo, userDetails, balanceAcc);
    }

    @Override
    public Double doWithdrawal(Double amount) {
        return this.balanceAcc - amount;
    }

    @Override
    public Double doDeposit(Double amount) {
        return this.balanceAcc + amount;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accNo='" + accNo + '\'' +
                ", userDetails=" + userDetails +
                ", balanceAcc=" + balanceAcc +
                '}';
    }
}
