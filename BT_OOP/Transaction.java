public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    public String getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    /*
    Transaction.
    */
    public void Transaction(String operation, double amount, double balance) {
        this.amount = amount;
        this.balance = balance;
        this.operation = operation;
    }

    public void setOperation(String s) {
        operation = s;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void setAmount(double a) {
        amount = a;
    }
}