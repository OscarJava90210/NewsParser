package Factory;


/**
 * Интерфейс с методами для хранения документов
 *
 * @author AAM
 */
public interface Storable {
    /**
     * Метод-геттер
     *
     * @return рег.номер документа
     */
     int getId();
    /**
     * Метод-геттер
     *
     * @return имя документа
     */
     String getTableName();

}
