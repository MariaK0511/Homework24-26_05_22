package contract2;

import document_abstract.Document;
import java.util.Date;

public class EmployeeContract extends Document {
    int docNum;
    Date dateDoc2;
    Date endContract;
    String employeeName;

    public EmployeeContract() {
    }

    public EmployeeContract(int docNum, Date dateDoc1, Date dateDoc2, Date endContract, String employeeName) {
        super(docNum, dateDoc1);
        this.docNum = docNum;
        this.dateDoc2 = dateDoc2;
        this.endContract = endContract;
        this.employeeName = employeeName;
    }

    @Override
    public void showInfo() {
        System.out.println("Номер документа " + docNum + "Дата документа" + dateDoc2 + "Дата документа" + dateDoc2 + "Дата окончания контракта" + endContract + "Имя сотрудника" + employeeName);
    }
}

