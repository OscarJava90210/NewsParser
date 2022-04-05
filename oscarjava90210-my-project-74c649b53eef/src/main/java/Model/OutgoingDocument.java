package Model;

import Factory.DocumentBuilder;
import java.util.Objects;

/**
 * Реализация подкласса (Исходящий документ)
 * @author AAM
 **/
public class OutgoingDocument extends Document {

    /*Объявление полей класса Model.OutgoingDocument*/

    /*Поле для адресата*/
    private String destination;
    /*Поле способ доставки*/
    private String deliveryMethod;


    @Override
    public int compareTo(Document doc) {
        return super.compareTo(doc);
    }

    /* конструктор по умолчанию интерф. Storable */
    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutgoingDocument that = (OutgoingDocument) o;
        return Objects.equals(destination, that.destination) && Objects.equals(deliveryMethod, that.deliveryMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, deliveryMethod);
    }

    /**
      * переопределение  текущих полей 
      *
      * @return  полей класса
      **/
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNameDoc() {
        return super.getNameDoc();
    }

    @Override
    public String getTextDoc() {
        return super.getTextDoc();
    }

    @Override
    public int  getRegNumDoc() {
        return super.getRegNumDoc();
    }

    @Override
    public int getDateRegDoc() {
        return super.getDateRegDoc();
    }

    @Override
    public String getAuthorOfDoc() {
        return super.getAuthorOfDoc();
    }

    public String getDestination() {
        return destination;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }



    /* метод  для генерации документов */
    public static OutgoingDocument.OutgoingBuilder newOutgoingBuilder() {
        return new OutgoingDocument().new OutgoingBuilder();
    }

    /*  класс строитель исходящего документа*/
    public class OutgoingBuilder implements DocumentBuilder<OutgoingBuilder> {
        @Override
        public OutgoingBuilder setId(int id) {
            OutgoingBuilder.this.setId(id);
            return this;
        }

        public OutgoingBuilder setType(String type) {
            OutgoingBuilder.this.setType(type);
            return this;
        }
        @Override
        public OutgoingBuilder setRegNumDoc(int regNumDoc) {
            return this;
        }

        @Override
        public OutgoingBuilder setDateRegDoc(int dateRegDoc) {
            OutgoingBuilder.this.setDateRegDoc(dateRegDoc);
            return this;
        }

        @Override
        public OutgoingBuilder setAuthorOfDoc(String authorOfDoc) {
            OutgoingBuilder.this.setAuthorOfDoc(authorOfDoc);
            return this;
        }

        @Override
        public OutgoingBuilder setNameDoc(String nameDoc) {
            OutgoingBuilder.this.setNameDoc(nameDoc);
            return this;
        }

        @Override
        public OutgoingBuilder setTextDoc(String textDoc) {
            OutgoingBuilder.this.setTextDoc(textDoc);
            return this;
        }


        public OutgoingBuilder setDestination(String destination) {
            OutgoingBuilder.this.setDestination(destination);
            return this;
        }


        public OutgoingBuilder setDeliveryMethod(String deliveryMethod) {
            OutgoingBuilder.this.setDeliveryMethod(deliveryMethod);
            return this;
        }

        public OutgoingDocument build() {
            return null;
        }
    }
    }
