package Domain;

import bank.BankAcc;

public class User {
    String name;
    String address;
    String icNo;
    BankAcc bankAcc;

    public User(String name, String address, String icNo, BankAcc bankAcc) {
        this.name = name;
        this.address = address;
        this.icNo = icNo;
        this.bankAcc = bankAcc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public BankAcc getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(BankAcc bankAcc) {
        this.bankAcc = bankAcc;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", icNo='" + icNo + '\'' +
                ", bankAcc=" + bankAcc +
                '}';
    }
}
