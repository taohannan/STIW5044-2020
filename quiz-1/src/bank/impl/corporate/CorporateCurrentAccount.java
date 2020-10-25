package bank.impl.corporate;

import Domain.Corporation;

import java.math.BigDecimal;

public class CorporateCurrentAccount extends AbstractCorporateAccount{

    public CorporateCurrentAccount(String accNo, Corporation companyDetails, Double balanceAcc) {
        super(accNo, companyDetails, balanceAcc);
    }

    @Override
    public void doWithdrawal(Double amount) {
        this.balanceAcc = this.balanceAcc - amount - extraCharges(amount);
    }

    @Override
    public void doDeposit(Double amount) {
        this.balanceAcc = this.balanceAcc + amount + extraCharges(amount);
    }

    private Double extraCharges(Double amount) {
        BigDecimal calculatedAmount = new BigDecimal(amount);
        BigDecimal newAmount = calculatedAmount.multiply(new BigDecimal("0.015")); //extra charges
        return newAmount.doubleValue();
    }
}
