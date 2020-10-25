package bank;

public interface BankAcc {

    public void doWithdrawal(Double amount);

    public Double getAccBalance();

    public void doDeposit(Double amount);

}
