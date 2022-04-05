package Model;

import Factory.Storable;
import java.text.SimpleDateFormat;
import java.util.Objects;

/**
 * абстарктный класс - документ
 *
 * @author AAM
 */
public abstract class   Document implements Comparable <Document>, Storable {

    /**
     * Объявление полей класса Model.Document
     */
    /*Поле для Id*/
    private int id;
    /*Поле для названия документа*/
    private String nameDoc;
    /*Поле с текстом документа*/
    private String textDoc;
    /*Поле с регистрационный номером документа*/
    private int regNumDoc;
    /*Поле с датой регистрации документа*/
    private int dateRegDoc;
    /*Поле с автором документа */
    private String authorOfDoc;
    /*Поле с типом документа*/
    private String typeDoc;


    /**
     * переопределение  текущих полей
     * @return текущих полей
     */
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public String getTextDoc() {
        return textDoc;
    }

    public void setTextDoc(String textDoc) {
        this.textDoc = textDoc;
    }

    public int getRegNumDoc() {
        return regNumDoc;
    }

    public void setRegNumDoc(int regNumDoc) {
        this.regNumDoc = regNumDoc;
    }

    public int getDateRegDoc() {
        return dateRegDoc;
    }

    public void setDateRegDoc(int dateRegDoc) {
        this.dateRegDoc = dateRegDoc;
    }

    public String getAuthorOfDoc() {
        return authorOfDoc;
    }

    public void setAuthorOfDoc(String authorOfDoc) {
        this.authorOfDoc = authorOfDoc;
    }

    public String getType() {
        return typeDoc;
    }

    public int setType(String type) {
        this.typeDoc = type;
        return setType(type);
    }

    /**
     * Метод cортировки документа по имени и автору
     * @return результат сортировки
     */
    public int compareTo(Document doc) {
        int result = this.authorOfDoc.compareTo(getAuthorOfDoc());
        if (result == 0) {
            return result;
        }
        result = this.nameDoc.compareTo(getNameDoc());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;
        Document document = (Document) o;
        return id == document.id && regNumDoc == document.regNumDoc && dateRegDoc == document.dateRegDoc && Objects.equals(nameDoc, document.nameDoc) && Objects.equals(textDoc, document.textDoc) && Objects.equals(authorOfDoc, document.authorOfDoc) && Objects.equals(typeDoc, document.typeDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameDoc, textDoc, regNumDoc, dateRegDoc, authorOfDoc, typeDoc);
    }

    /**
     * Метод вывода на консоль
     * 
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return " Тип документа: " + getType() + " №" + getId() + "  от " + dateFormat.format(getDateRegDoc()) + ". Название документа: " + getNameDoc();
    }
}



