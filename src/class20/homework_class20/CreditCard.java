package class20.homework_class20;

public class CreditCard {

/*
Task 2:
Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
*/


    double balance;
    double interest;

    CreditCard(double enterBalance) {
        this.balance = enterBalance;
    }

    double calculateInterest() {
        if (balance <= 1000) {
            interest = balance * 0.05;
        } else if (balance > 1001 && balance <= 3000) {
            interest = balance * 0.10;
        } else if (balance > 3001 && balance <= 5000) {
            interest = balance * 0.15;
        } else if (balance > 5001 && balance <= 10000) {
            interest = balance * 0.20;
        } else {
            interest = balance * 0.30;
        }
        return interest;
    }
}

    class Visa extends CreditCard {

        Visa(double enterBalance) {
            super(enterBalance);
        }

        @Override
        double calculateInterest() {
            if (balance <= 1000) {
                interest = balance * 0.15;
            } else if (balance > 1001 && balance <= 3000) {
                interest = balance * 0.20;
            } else if (balance > 5001 && balance <= 10000) {
                interest = balance * 0.30;
            } else {
                System.out.println("Not Valid Interest Rate");
            }
            return interest;
        }

    }

    class AX extends CreditCard {

        AX(double enterBalance) {
            super(enterBalance);
        }

        @Override
        double calculateInterest() {
            if (balance <= 1000) {
                interest = balance * 0.10;
            } else if (balance > 1001 && balance <= 3000) {
                interest = balance * 0.15;
            } else {
                interest = balance * 0.30;
            }
            return interest;
        }

    public static void main(String[] args) {

        CreditCard obj = new CreditCard(20000);
        System.out.println(obj.calculateInterest());

        Visa obj1 = new Visa(15000);
        System.out.println(obj1.calculateInterest());

        AX obj2 = new AX(5000);
        System.out.println(obj2.calculateInterest());


    }
}
