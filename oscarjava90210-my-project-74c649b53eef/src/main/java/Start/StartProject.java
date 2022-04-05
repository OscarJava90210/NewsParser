package Start;

import Model.Document;
import Service.ServiceReport;
import Service.StorageList;
import java.util.ArrayList;

/*Класс для старта программы
 */
public class StartProject {
    public static void main(String[] args) {
        int countDocuments = 10;
        ArrayList<Document> documentArrayList = StorageList.creater(countDocuments);
        System.out.println(ServiceReport.report(documentArrayList));
    }
}