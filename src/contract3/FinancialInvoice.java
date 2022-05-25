package contract3;

import Documents.classes.Register;
import document_abstract.Document;
import figeres_task1.Figure;

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
        System.out.println("Итоговая сумма за месяц " + sumForMonth + " Дата документа "+ numDoc + " Номер документа "+ numDoc  + "Код департамента" + departmentCode);
    }
}
