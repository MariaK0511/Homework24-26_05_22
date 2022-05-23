package task3;

public class Atm {
    int sumInATM;
    int cashAmount20;
    int cashAmount50;
    int cashAmount100;

    Atm(int cashAmount20, int cashAmount50, int cashAmount100) {
        this.cashAmount20 = cashAmount20;
        this.cashAmount50 = cashAmount50;
        this.cashAmount100 = cashAmount100;
    }
    public void getMoney(int sum20, int sum50, int sum100) {
        sumInATM = (sum20 * cashAmount20) + (sum50 * cashAmount50) + (sum100 * cashAmount100);
        System.out.println(sumInATM);
    }
}



