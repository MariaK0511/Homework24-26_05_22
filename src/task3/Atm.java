package task3;

import java.util.Scanner;

public class Atm {
    int sumInATM = 0;
    int cash20;
    int cash50;
    int cash100;

    Atm(int cash20, int cash50, int cash100) {
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
    }

    public void putMoneyToATM() {
        int money = new Scanner(System.in).nextInt();
        if ((this.cash20 == 20) || (this.cash50 == 50) || (this.cash100 == 100)) {
            System.out.println(sumInATM += money);
        }
        if ((this.cash20 != 20) || (this.cash50 != 50) || (this.cash100 != 100)) {
            System.out.println("Error! Such a bill cannot be put into an ATM");
        }


    }
}
