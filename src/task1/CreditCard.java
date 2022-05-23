package task1;

import java.util.Scanner;

public class CreditCard {
    String numCard;
    int accountBalance;
    int money = new Scanner(System.in).nextInt();
    CreditCard(String numCard, int accountBalance) {
        this.numCard = numCard;
        this.accountBalance = accountBalance;
    }
    public void putMoneyOnCard() {

        accountBalance += money;
    }
    public void withdrawMoneyFromCard() {
        accountBalance -= money;
        if (accountBalance == 0){
            System.out.println("Error!There is no money");
        }
        if(accountBalance>0){
            System.out.println("Текущий счёт: " + accountBalance);
        }
        if (accountBalance<money && accountBalance!=0){
            System.out.println("This sum cannot be withdrawn");
        }
    }
    public void cardsInfo(){

        System.out.println( "Card number : " + numCard+ " account balance: " + accountBalance);
    }
}
