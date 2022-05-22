package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
количеством купюр номиналом 20, 50 и 100.
Сделать метод для добавления денег в банкомат.
         */
        Atm atm = new Atm(20, 50, 100);
        atm.putMoneyToATM();
    }
}

