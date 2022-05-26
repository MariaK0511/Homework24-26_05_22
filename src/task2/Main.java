package task2;

public class Main {
    public static void main(String[] args) {
        /*
        1. Создать класс для описания компьютера, в этом классе должны быть поля:
        стоимость, модель(строковый тип), RAM и HDD.+
Для полей RAM и HDD следует создать свои собственные классы.+
Классы для RAM и HDD должны иметь конструктор по умолчанию и
конструктор со всеми параметрами. +
Класс RAM имеет поля "название" и "объем".+
Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний). +
Класс Computer должен иметь два конструктора:
- первый - с параметрами стоимость и модель,+
- второй - со всеми полями.+
При создании объекта "компьютер" с помощью первого конструктора
должны создаваться поля RAM и HDD с помощью конструкторов по умолчанию.+
В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
Тестовый сценарий для проверки:
создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;+
создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.+
         */
        Computer.Ram ram = new Computer.Ram();
        Computer.Ram ram1 = new Computer.Ram("DDR", 4, "Internal");

        Computer.Hdd hdd = new Computer.Hdd();
        Computer.Hdd hdd1 = new Computer.Hdd("WD", 125);
        Computer computer = new Computer(1000, "Asus");
        System.out.println("Computer: ");
        System.out.println(computer.cost);
        System.out.println(computer.model);
        System.out.println(computer.ram);
        System.out.println(computer.hdd);


        Computer computer1 = new Computer(1600, "Apple");
        System.out.println("Computer1: ");
        System.out.println(computer1.cost);
        System.out.println(computer1.model);

        Computer computer2 = new Computer(1200, "Samsung", ram, hdd);
        System.out.println("Computer2: ");
        computer2.compInfo();
        ram1.ramInfo();
        hdd1.hddInfo();


    }
}
