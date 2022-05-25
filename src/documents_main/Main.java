package documents_main;

import Documents.classes.Register;
import contract1.SupplyOfGoods;
import contract2.EmployeeContract;
import contract3.FinancialInvoice;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
         /*
        3. Создать систему для учета документов.
Создать класс Регистр, который будет иметь методы: +
- сохранения документа в регистре +
- предоставление информации о документе +
Система может работать с тремя типами документов:
1) Контракт на поставку товаров
Содержит поля:
- Номер документа
- Тип товаров
- Количество товаров
- Дата документа
2) Контракт с сотрудником
Содержит поля:
- Номер документа
- Дата документа
- Дата документа
- Дата окончания контракта
- Имя сотрудника
3) Финансовая накладная
Содержит поля:
- Итоговая сумма за месяц
- Дата документа
- Номер документа
- Код департамента
- Класс регистр должен содержать внутри себя массив и при добавлении
документа в регистр этот добавляемый документ должен добавляться в массив:
- Массив для класса регистра должен быть размером 10;
- Для полей "Дата документа" следует использовать тип данных Date;
- В методе предоставления информации о документе следует выводить
на экран информацию о переданном входным параметром документе;
- Каждый класс для описания документов должен содержать конструктор
с параметрами и без;
- Для имитации работы системы создайте класс Main, который будет
содержать только один метод public static void main +
В этом методе напишите код для создания каждого из типов
документов, добавления их в регистр и вывода информации о документе;
- Все классы разместить по пакетам;
При выполнении задания использовать понятия интерфейсов и абстрактных классов.
         */
        Register register = new Register();

        Date date = new Date();
        SupplyOfGoods supplyOfGoods = new SupplyOfGoods(33, "Books", 20, date);
        SupplyOfGoods supplyOfGoods1 = new SupplyOfGoods();

        EmployeeContract employeeContract = new EmployeeContract(16, date, date, date, "Mike");
        EmployeeContract employeeContract1 = new EmployeeContract();

        FinancialInvoice financialInvoice = new FinancialInvoice(1000, date, 10, 2233);
        FinancialInvoice financialInvoice1 = new FinancialInvoice();
        register.saveDocInRegister(supplyOfGoods, 0);
        register.saveDocInRegister(supplyOfGoods1, 1);
        register.saveDocInRegister(employeeContract, 2);
        register.saveDocInRegister(employeeContract1, 3);
        register.saveDocInRegister(financialInvoice,4);
        register.saveDocInRegister(financialInvoice1,5);
        register.showInfo();

    }
}
