package task1;

public class CreditCard {
    String numCard;
    int accountBalance;
    int money;
    CreditCard(String numCard, int accountBalance) {
        this.numCard = numCard;
        this.accountBalance = accountBalance;
    }
    public void putMoneyOnCard(int money) {
        this.money = money;
        accountBalance += money;
    }
    public void withdrawMoneyFromCard(int money) {
        this.money = money;
        accountBalance -= money;
        if (accountBalance == 0) {
            System.out.println("Error!There is no money");
        }
        if (accountBalance < money && accountBalance != 0) {
            System.out.println("This sum cannot be withdrawn");
        }
    }
    public void cardsInfo() {
        System.out.println("Card number : " + numCard + " account balance: " + accountBalance);
    }
}
