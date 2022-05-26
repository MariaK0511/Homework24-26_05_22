package contract3;

import document_abstract.Document;

import java.util.Date;

public class FinancialInvoice extends Document {
    int sumForMonth;
    int departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int sumForMonth, Date dateDoc, int docNum, int departmentCode) {
        super(docNum, dateDoc);
        this.sumForMonth = sumForMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public void showInfo() {
        System.out.println("Итоговая сумма за месяц " + sumForMonth + " Дата документа " + numDoc + " Номер документа " + numDoc + " Код департамента " + departmentCode);
    }
}
