package matven.java.lab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Вывести на экран список ключей Есть коллекция HashMap<String, String>,
 * туда занесли 10 различных строк.
 * Вывести на экран список ключей, каждый элемент с новой строки.
 *
 * @author Artem Matveychuk
 */
public class KeyHashMapWork {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

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

        for(String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
