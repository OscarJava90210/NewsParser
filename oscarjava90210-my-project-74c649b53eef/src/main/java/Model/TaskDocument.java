package Model;

import Factory.DocumentBuilder;
import java.util.Objects;

/**
 * Реализация подкласа Задачи с полями
 *
 * @author AAM
 */
public class TaskDocument extends Document {

    /*Объявление полей класса*/
    /*Поле для даты выдачи поручения*/
    private int dateTask;

    /*Поле срок исполнения поручения*/
    private int periodOfTask;

    /*Поле для исполнителя поручения*/
    private String executor;

    /*Поле статуса поручения*/
    private boolean mark;

    /*Поле для контроля*/
    private String controller;

    /*Геттер и сеттер текущего класса*/
    public int getDateTask() {
        return dateTask;
    }

    public void setDateTask(int dateTask) {
        this.dateTask = dateTask;
    }

    public int getPeriodOfTask() {
        return periodOfTask;
    }

    public void setPeriodOfTask(int periodOfTask) {
        this.periodOfTask = periodOfTask;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    /**
     * переопределение  текущих полей класса для получения имени
     * @return  полей класса
     */
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getTableName() {
        return null;
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
    public int getRegNumDoc() {
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

    /**
     * Для сравнения имени  с текущим классом
     */
    @Override
    public int compareTo(Document o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * переопределение входящих сообщенией для генерации документов
     */
    public static TaskBuilder newTaskBuilder() {
        return new TaskDocument().new TaskBuilder();
    }

    /**
     * внутренний класс строитель поручения
     */
    public class TaskBuilder implements DocumentBuilder<TaskBuilder> {
        @Override
        public TaskBuilder setId(int id) {
            TaskBuilder.this.setId(id);
            return this;
        }

        @Override
        public TaskBuilder setRegNumDoc(int regNumDoc) {
            TaskBuilder.this.setRegNumDoc(regNumDoc);
            return this;
        }

        @Override
        public TaskBuilder setDateRegDoc(int dateRegDoc) {
            TaskBuilder.this.setDateRegDoc(dateRegDoc);
            return this;
        }

        @Override
        public TaskBuilder setAuthorOfDoc(String authorOfDoc) {
            TaskBuilder.this.setAuthorOfDoc(authorOfDoc);
            return this;
        }

        @Override
        public TaskBuilder setNameDoc(String nameDoc) {
            TaskBuilder.this.setNameDoc(nameDoc);
            return this;
        }

        @Override
        public TaskBuilder setTextDoc(String textDoc) {
            TaskBuilder.this.setTextDoc(textDoc);
            return this;
        }

        /**
         * Конструктор по умолчанию
         */
        public TaskBuilder build() {
            return TaskBuilder.this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskDocument)) return false;
        TaskDocument that = (TaskDocument) o;
        return dateTask == that.dateTask && periodOfTask == that.periodOfTask && mark == that.mark && Objects.equals(executor, that.executor) && Objects.equals(controller, that.controller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTask, periodOfTask, executor, mark, controller);
    }
}