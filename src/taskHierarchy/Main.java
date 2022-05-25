package taskHierarchy;

public class Main {
    public static void main(String[] args) {
        /*
        2. Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название
должности и имплементировать этот метод в созданные классы.
         */
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.titleOfPosition();
        worker.titleOfPosition();
        accountant.titleOfPosition();
    }
}
