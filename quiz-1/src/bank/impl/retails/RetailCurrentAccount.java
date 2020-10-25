package bank.impl.retails;

import java.math.BigDecimal;

public class RetailCurrentAccount extends AbstractRetailAcc{

    public RetailCurrentAccount(String accNo, Double balanceAcc) {
        super(accNo, balanceAcc);
    }

    @Override
    public void doWithdrawal(Double amount) {
        if(amount == 0 ){
            //add uncheck exception if incase amount is zero
            throw new RuntimeException("Cant withdraw with zero amount");
        }
        this.balanceAcc = this.balanceAcc - amount - extraCharges(amount);
    }

    @Override
    public void doDeposit(Double amount) {
        if(amount == 0 ){
            //add uncheck exception if incase amount is zero
            throw new RuntimeException("Cant Deposit with zero amount");
        }
        this.balanceAcc = this.balanceAcc + amount + extraCharges(amount);
    }

    private Double extraCharges(Double amount) {
        BigDecimal calculatedAmount = new BigDecimal(amount);
        BigDecimal newAmount = calculatedAmount.multiply(new BigDecimal("0.012")); //extra charges
        return newAmount.doubleValue();
    }

    @Override
    public String toString() {
        return "Current Saving Account{" +
                "accNo='" + accNo + '\'' +
                ", balanceAcc=" + balanceAcc +
                ", Extra Charges= 0.012"+
                '}';
    }
}
