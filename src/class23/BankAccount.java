package class23;

public class BankAccount {

    private String username;
    private String password;
    private double accountBalance = 120;


    public BankAccount(String username, String password) { // constructor
        this.username = username;
        this.password = password;
    }

    public double getAccountBalance(String password) { // getter method
        if (password.equals(this.password)) {
            return accountBalance;
        } else {
            return 0;
        }

    }

    public double setAccountBalance(double balance) { // setter method
        return accountBalance = balance;
    }

    void setPassword(String pass) {
        this.password = pass;
    }


    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Mark", "111pass");
        System.out.println(obj.getAccountBalance("111pass"));
        System.out.println(obj.setAccountBalance(120000));


    }
}
