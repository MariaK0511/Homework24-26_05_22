package contract1;

import Documents.classes.Register;
import document_abstract.Document;


import java.util.Date;

public class SupplyOfGoods extends Document {
    int docNum;
    String typeOfGoods;
    int quantityGoods;

    public SupplyOfGoods() {
    }

    public SupplyOfGoods(int docNum, String typeOfGoods, int quantityGoods, Date date) {
        super(docNum, date);
        this.typeOfGoods = typeOfGoods;
        this.quantityGoods = quantityGoods;
    }


    @Override
    public void showInfo() {
        System.out.println("Номер документа " + docNum + "Тип товаров " + typeOfGoods + " Количество товаров " + quantityGoods + "Дата документа " + date);
    }
}
