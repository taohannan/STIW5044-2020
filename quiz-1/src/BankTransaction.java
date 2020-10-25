import Domain.User;
import bank.BankAcc;
import bank.impl.retails.RetailCurrentAccount;
import bank.impl.retails.RetailSavingAccount;

public class BankTransaction {

    public static void main(String[] args) {

        //Create Saving Account Bank
        BankAcc retailSavingAccount = new RetailSavingAccount("23453335", new Double("3000.00"));
        //Create User with Saving Account
        User userSavingAcc = new User("Abu", "33, Lorong Rumah","8392939423645", retailSavingAccount);
        System.out.println("User Saving Account Created = " + userSavingAcc.toString());

        //Create Current Account Bank
        BankAcc retailCurrentAccount = new RetailCurrentAccount("3456322", new Double("500000"));
        //Create User with Current Account
        User userCurrentAcc = new User("Angah", "34, Lorong Kedai","8392939423645", retailCurrentAccount);
        System.out.println("User Current Account Created = " + userCurrentAcc.toString());


        //Do Transaction on Saving Account
        try {
            System.out.println("User "+userSavingAcc.getName()+" saving Account balance = "+ userSavingAcc.getBankAcc().getAccBalance());
            System.out.println("Doing deposit for 400 Ringgit");
            userSavingAcc.getBankAcc().doDeposit(new Double("400"));
            System.out.println("Doing withdrawal for 200 Ringgit");
            userSavingAcc.getBankAcc().doWithdrawal(new Double("200"));
            System.out.println("User "+userSavingAcc.getName()+" new saving Account balance = "+ userSavingAcc.getBankAcc().getAccBalance());

            //Do Transaction on Current Account
            System.out.println("User "+userCurrentAcc.getName()+" saving Account balance = "+ userCurrentAcc.getBankAcc().getAccBalance());
            System.out.println("Doing deposit for 400 Ringgit");
            userCurrentAcc.getBankAcc().doDeposit(new Double("400"));
            System.out.println("Doing withdrawal for 200 Ringgit");
            userCurrentAcc.getBankAcc().doWithdrawal(new Double("200"));
            System.out.println("User "+userCurrentAcc.getName()+" new saving Account balance = "+ userCurrentAcc.getBankAcc().getAccBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
