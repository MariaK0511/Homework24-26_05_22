package document_class;

import document_abstract.Document;

public class Register {
    Document[] documents = new Document[10];
    public void saveDocInRegister(Document document, int index) {
        documents[index] = document;
    }
    public void showInfo() {
        for (Document document : documents) {
            if (document != null) {
                document.showInfo();
            }
        }
    }
}
