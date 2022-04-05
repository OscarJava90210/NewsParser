package ServiceRepo;

import Model.Document;
import java.util.ArrayList;
import Exception.DocumentExistsException;
import Service.StorageList;

/**
 * Репозиторий для класса task
 *
 * @author AAM
 */
public class TaskRepository extends StorageList {

    /**
     * Конструктор TaskRepository
     */
    public TaskRepository() {
    }

    /**
     * Поле объект для instance
     */
    static TaskRepository instance;

    /**
     * Для получения Instance
     */
    public static TaskRepository getInstance() {
        return instance;
    }

    /**
     * @method для добавления документа в storage list
     */
    public void addDoc(Document document) throws DocumentExistsException {
        verification(document);
        documentArrayList.add(document);
    }

    /*
     *@method Удаление storage list
     * */
    public void remove(Document document) throws DocumentExistsException {
        boolean exist = false;
        for (int i = 0; i < documentArrayList.size(); i++) {
            if (documentArrayList.get(i).equals(document)) {
                documentArrayList.remove(i);
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new DocumentExistsException("Документ не найден");
        }
    }

    /*Проверка существующего рег.номера*/
    public void verification(Document document) throws DocumentExistsException {
        for (Document doc : documentArrayList) {
            if (doc.getRegNumDoc() == document.getRegNumDoc()) {
                throw new DocumentExistsException("Регистрационный номер уже существует");
            }
        }
    }

    /**
     * @method для storage list
     */
    ArrayList<Document> documentArrayList = new ArrayList<Document>() {
    };
}