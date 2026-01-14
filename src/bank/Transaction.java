package bank;

public class Transaction {
    long accountNumber;
    int type;
    long amount;
    String dateTime;

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getType() {
        return type;
    }

    public long getAmount() {
        return amount;
    }

    public String getDateTime() {
        return dateTime;
    }

}
