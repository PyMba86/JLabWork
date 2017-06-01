package matven.java.lab.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Коллекция HashMap из Object Есть коллекция HashMap<String, Object>,
 * туда занесли 10 различных пар объектов. Вывести содержимое
 * коллекции на экран, каждый элемент с новой строки.
 *
 * @author Artem Matveychuk
 */
public class HashMapObjectWork {
    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();

        map.put("A", 1);
        map.put("C", false);
        map.put("D", null);
        map.put("E", "Destiny");
        map.put("B", 2);
        map.put("F", '6');
        map.put("G", 3L);
        map.put("H", 123f);

        map.forEach((k, v) ->
                System.out.println(k + "-" + v));
    }
}
