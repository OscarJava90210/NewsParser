package Factory;

import java.util.Date;

/**
 * Интерфейс для генерации документов
 *
 * @param <T> поля builder
 *
 * @author AAM
 */
public interface DocumentBuilder<T> {

    T setId (int id);
    
    T setRegNumDoc (int regNumDoc);
    
    T setDateRegDoc (int setDateRegDoc);
    
    T setAuthorOfDoc (String authorOfDoc);
    
    T setNameDoc (String nameDoc);
    
    T setTextDoc (String textDoc);


}
