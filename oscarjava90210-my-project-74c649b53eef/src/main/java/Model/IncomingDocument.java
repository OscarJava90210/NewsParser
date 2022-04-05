package Model;

import Factory.DocumentBuilder;
import java.util.Date;
import java.util.Objects;

/**
  * Класс- Model.IncomingDocument
  * 
  */
public class IncomingDocument extends Document {

   /**
     * Объявление полей класса Model.IncomingDocument 
     */
      
    /*Поле для отправителя*/
    private String sender;
    /*Поле для адресата*/
    private String addressee;
    /*Поле для исходящего номера*/
    private int IncNumber;
    /*Поле для даты регистрации*/
    private Date IncDate;
    /*конструктор по умолчанию*/
    private IncomingDocument() {
    
    }

    /* Вызов метода для построения*/
    public static IncomingBuilder newIncomingBuilder() {
        return new IncomingDocument().new IncomingBuilder();
    }

    @Override
    public String getTableName() {
        return null;
    }

    /**
      * внутренний класс строитель входящего документа
      */
    public class IncomingBuilder implements DocumentBuilder<IncomingBuilder> {

        private IncomingBuilder() {
        }

       /**
         * переопределение  текущих полей 
         *
         * @return  полей класса
         */
     
        @Override
        public IncomingBuilder setId(int id) {
           IncomingDocument.this.setId(id);
            return this;
        }

        @Override
        public IncomingBuilder setRegNumDoc(int regNumDoc) {
           IncomingDocument.this.setRegNumDoc(regNumDoc);
            return this;
        }

        @Override
        public IncomingBuilder setDateRegDoc(int setDateRegDoc) {
            IncomingDocument.this.setDateRegDoc(setDateRegDoc);
            return this;
        }

        @Override
        public IncomingBuilder setAuthorOfDoc(String authorOfDoc) {
          IncomingDocument.this.setAuthorOfDoc(authorOfDoc);
            return this;
        }

        @Override
        public IncomingBuilder setNameDoc(String nameDoc) {
           IncomingDocument.this.setNameDoc(nameDoc);
            return this;
        }

        @Override
        public IncomingBuilder setTextDoc(String textDoc) {
            IncomingDocument.this.setTextDoc(textDoc);
            return this;
        }

        public IncomingBuilder setSender(String sender) {
            IncomingDocument.this.sender = sender;
            return this;
        }

        public IncomingBuilder setAddressee(String addressee) {
            IncomingDocument.this.addressee = addressee;
            return this;
        }

        public IncomingBuilder setIncNumber(int oNumber) {
            IncomingDocument.this.IncNumber = IncNumber;
            return this;
        }

        public IncomingBuilder setIncDate(Date oDate) {
            IncomingDocument.this.IncDate = IncDate;
            return this;
        }

        public IncomingDocument build() {
            return IncomingDocument.this;
        }

    }

    public String getSender() {
        return sender;
    }


    public String getAddressee() {
        return addressee;
    }

    /* предоставление доступа к полю документа*/
    public int getIncNumber() {
        return IncNumber;
    }

    /* предоставление доступа к полю дата документа*/
    public Date getIncDate() {
        return IncDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IncomingDocument)) return false;
        IncomingDocument that = (IncomingDocument) o;
        return IncNumber == that.IncNumber && Objects.equals(sender, that.sender) && Objects.equals(addressee, that.addressee) && Objects.equals(IncDate, that.IncDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, addressee, IncNumber, IncDate);
    }


}
