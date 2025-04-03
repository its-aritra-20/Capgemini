package Encapsulation;


public class Netbank {
    private int currentbalance = 5000;
    private int pin = 1234;

    public void setBalance(int deposit, int pin) throws InvalidPinException {
        if (this.pin == pin) {
            currentbalance += deposit;
        } else {
            throw new InvalidPinException("Invalid PIN");
        }
    }

    public void getBalance(int pin) throws InvalidPinException {
        if (this.pin == pin) {
            System.out.println(currentbalance);
        } else {
            throw new InvalidPinException("Invalid PIN");
        }
    }

    public void withdraw(int withdraw, int pin) throws InvalidPinException {
        if (this.pin == pin) {
            if (currentbalance >= withdraw) {
                currentbalance -= withdraw;
            } else {
                System.out.println("Not enough balance");
            }
        } else {
            throw new InvalidPinException("Invalid PIN");
        }
    }
}
