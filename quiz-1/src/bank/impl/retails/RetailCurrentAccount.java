package bank.impl.retails;

import Domain.User;

import java.math.BigDecimal;

public class CurrentAccount extends AbstractRetailAcc{
    public CurrentAccount(String accNo, User userDetails, Double balanceAcc) {
        super(accNo, userDetails, balanceAcc);
    }

    @Override
    public Double doWithdrawal(Double amount) {
        return this.balanceAcc - amount - extraCharges(amount);
    }

    @Override
    public Double doDeposit(Double amount) {
        return this.balanceAcc + amount + extraCharges(amount);
    }

    private Double extraCharges(Double amount) {
        BigDecimal calculatedAmount = new BigDecimal(amount);
        BigDecimal newAmount = calculatedAmount.multiply(new BigDecimal("0.012")); //extra charges
        return newAmount.doubleValue();
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accNo='" + accNo + '\'' +
                ", userDetails=" + userDetails +
                ", balanceAcc=" + balanceAcc +
                ", Extra Charges= 0.012"+
                '}';
    }
}
