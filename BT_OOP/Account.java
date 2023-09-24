import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;
    private String deposit;
    private String withdraw;

    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance = balance - amount;
        }
    }

    /**
     * addTransaction.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * printTransaction.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.%n", i + 1,
                    transaction.getOperation().equals(Transaction.DEPOSIT) ? "Nap tien" : "Rut tien",
                    transaction.getAmount(), transaction.getBalance());
        }
    }

    /**
     * main.
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(2000.255, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}
