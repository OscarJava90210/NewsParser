package Factory;

import Model.OutgoingDocument;

/**
 * Класс - фабрика исходящих документов
 * @return объект - исходящий документ
 * @author AAM
 */
public class OutgoingFactory implements DocumentFactory<OutgoingDocument> {
  
/**
  * метод генерации исходящего документа
  * {@inheritDoc}
  *
  * @return получение исходящего документа
  */
  @Override
    public OutgoingDocument createDocument() {
        return OutgoingDocument.newOutgoingBuilder()
                .setDestination("Место назначения")
                .setDeliveryMethod("Метод получения")
                .build();
    }
}
