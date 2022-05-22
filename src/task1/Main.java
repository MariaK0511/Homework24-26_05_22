package task1;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать класс CreditCard с полями номер счета, текущая сумма на счету.
        Добавьте метод, который позволяет начислять сумму на кредитную карточку.
        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
        Добавьте метод, который выводит текущую информацию о карточке.
        Напишите программу, которая создает три объекта класса CreditCard
        y которых заданы номер счета и начальная сумма.
        Тестовый сценарий для проверки:
        Положите деньги на первые две карточки и снимите с третьей.
        Выведите на экран текущее состояние всех трех карточек.
         */
        CreditCard firstCard = new CreditCard("1444", 100);
        CreditCard secondCard = new CreditCard("3456", 12);
        CreditCard thirdCard = new CreditCard("1230", 10);

        firstCard.cardsInfo();
        firstCard.putMoneyOnCard();

        secondCard.cardsInfo();
        secondCard.putMoneyOnCard();

        thirdCard.cardsInfo();
        thirdCard.withdrawMoneyFromCard();
    }
}
