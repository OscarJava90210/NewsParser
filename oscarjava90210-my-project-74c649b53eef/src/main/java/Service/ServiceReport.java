package Service;

import Model.Document;
import java.util.ArrayList;
import java.util.Collections;

/* Класс для порядкового вывода информации на консоль
 *
 * @author AAM
 * */
public class ServiceReport {
    public static StringBuffer report(ArrayList<Document> documentsList) {
        StringBuffer report = new StringBuffer();
        report.append("ОТЧЕТ: ").append("\n");
        Document checkDocument;
        Collections.sort(documentsList);
        //Вывод первого документа из коллекции
        checkDocument = documentsList.get(0);
        report.append("Автор - ").append(checkDocument.getAuthorOfDoc()).append(":\n");
        for (Document document : documentsList) {
            if (!document.getAuthorOfDoc().equals(checkDocument.getAuthorOfDoc())) {
                checkDocument = document;
                report.append("Автор - ").append(document.getAuthorOfDoc()).append(":\n");
            }
            report.append(document.toString()).append("\n");
        }
        return report;
    }
}

