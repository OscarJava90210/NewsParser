package Service;

import java.util.ArrayList;
import java.util.Arrays;

/** Генерация документов где система выводит отчет.
  * @author AAM
  *  Отчет содержит перечень авторов документов и список документов, созданных ими:*/
public interface ServiceList {

    //Список сотрудников
    ArrayList<String> workerList =
            new ArrayList<String>(Arrays
                    .asList("Горбунов Александр Николаевич","Пискурев Федор Андреевич",
                            "Иголкин Александр Николаевич","Головань Александр Васильевич",
                            "Ракитин Максим Андреевич","Хайруллин Руслан Мансурович"));

    //Список документов
    ArrayList<String> listName =
            new ArrayList<String>(Arrays
                    .asList("Договор субподряда","Проектная документация",
                            "Сметы","Письма","Пропуска","Заявки"));


}
