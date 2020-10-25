package Domain;

import bank.BankAcc;

public class Corporation {
    String companyName;
    String address;
    BankAcc bankAcc;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BankAcc getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(BankAcc bankAcc) {
        this.bankAcc = bankAcc;
    }

    @Override
    public String toString() {
        return "Corporation{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", bankAcc=" + bankAcc +
                '}';
    }
}
