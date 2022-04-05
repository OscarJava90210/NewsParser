package Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*Класс для генерации чисел и дат
*
* @author AAM
* */
public   class ServiceGenerator  {

    public static Random random = new Random();
    /*Генерация числа*/
    public static Date randomInt() {
        return new Date(System.currentTimeMillis() - ThreadLocalRandom.current().nextInt(10 * 1000));
    }
    /*Генерация даты */
    public static Date randomDate() {
        return new Date(System.currentTimeMillis() - ThreadLocalRandom.current().nextLong(10 * 1000));
    }
    /*Генерация элемента из листа*/
    public static <T> T randomFromList(ArrayList<T> list) {
        return list.get(random.nextInt(list.size()));
    }
}





