package document_abstract;

import java.util.Date;

public abstract class Document implements ShowInfo {
    public int numDoc;
    public Date date;

    public  Document(){
    }
   public Document(int numDoc, Date date){
        this.numDoc=numDoc;
        this.date=date;
    }

}
