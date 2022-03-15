package Staff;

/**
 * Реализация подкласса Персонал
 * @author AAM
 * */
public class Department extends Staff{
    /**
     * Объявление полей
     */

    /*Полное наименование */
    private String fullName;
    /*Краткое наименование*/
    private String shortName;
    /*Руководитель*/
    private String chief;
    /*Контактные телефоны*/
    private String contact;

    @Override
    public String toString() {
        return "Подразделение - " + this.fullName + ". Руководитель - " + this.chief;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getChief() {
        return chief;
    }
    public void setChief(String chief) {
        this.chief = chief;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
}