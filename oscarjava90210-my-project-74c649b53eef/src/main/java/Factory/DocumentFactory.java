package Factory;

/**
 * Интерфейс для генерации классов Model.Document
 *
 * @author AAM
 */
public interface DocumentFactory<T> {
   
   /**
     * @param <T> фабрика для создания определенного типа документа
     */
    T createDocument();

}
