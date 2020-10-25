package bank.impl.retails;

public class RetailSavingAccount extends AbstractRetailAcc {


    public RetailSavingAccount(String accNo, Double balanceAcc) {
        super(accNo, balanceAcc);
    }

    @Override
    public void doWithdrawal(Double amount) {
        if(amount == 0 ){
            throw new RuntimeException("Cant withdraw with zero amount");
        }
        this.balanceAcc = this.balanceAcc - amount;
    }

    @Override
    public void doDeposit(Double amount) {
        if(amount == 0 ){
            throw new RuntimeException("Cant deposit with zero amount");
        }
        this.balanceAcc = this.balanceAcc + amount;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accNo='" + accNo + '\'' +
                ", balanceAcc=" + balanceAcc +
                '}';
    }
}
