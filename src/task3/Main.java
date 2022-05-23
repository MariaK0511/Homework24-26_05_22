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
        System.out.println("enter the number of bills 20: ");
        int cash20 = new Scanner(System.in).nextInt();
        System.out.println("enter the number of bills 50: ");
        int cash50 = new Scanner(System.in).nextInt();
        System.out.println("enter the number of bills 100: ");
        int cash100 = new Scanner(System.in).nextInt();

        Atm atm = new Atm(10, 10, 3);
        atm.setMoney(cash20, cash50, cash100);
        System.out.println(atm.getSumInATM());
    }
}

