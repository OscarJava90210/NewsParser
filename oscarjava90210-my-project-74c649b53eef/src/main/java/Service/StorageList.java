package Service;

import Factory.DocumentFactory;
import Factory.IncomingFactory;
import Factory.OutgoingFactory;
import Factory.TaskFactory;
import Model.Document;
import ServiceRepo.IncomingRepository;
import ServiceRepo.OutgoingRepository;
import ServiceRepo.TaskRepository;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Класс-фабрика для созданий документов 
 */
public abstract class StorageList {
    IncomingRepository incomingRepository = new IncomingRepository();
    OutgoingRepository outgoingRepository = new OutgoingRepository();
    TaskRepository taskRepository = new TaskRepository();

    public static ArrayList<Document> creater(int count) {
        ArrayList<DocumentFactory> fac = new ArrayList(Arrays.asList(
                new IncomingFactory(),
                new OutgoingFactory(),
                new TaskFactory()

        ));
        public static void generater(int countDoc){
            StorageList storageList = StorageList.getInstance();
            Document document = null;
            for (int i = 0; i < count; i++) {
                document = fac.createDocument();
                storageList.addDoc(document);
            }
        }
    }
}

