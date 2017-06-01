package matven.java.lab.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap из 10 пар Создать коллекцию HashMap<String, String>,
 * занести туда 10 пар строк: арбуз - ягода, банан - трава,
 * вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст,
 * жень-шень - корень, земляника - ягода, ирис - цветок,
 * картофель - клубень.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * @author Artem Matveychuk
 */
public class HashMapWork {
    public static void main(String[] args) throws Exception {

        Map<String, String> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        map.forEach((k, v) ->
                System.out.println(k + "-" + v));

        /* Вариант №2
         *for (Map.Entry<String, String> entry : map.entrySet())
         * {
         * String key = entry.getKey();
         * String value = entry.getValue();
         * }
         */

    }
}
