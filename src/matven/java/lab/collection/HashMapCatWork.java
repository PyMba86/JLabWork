package matven.java.lab.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Коллекция HashMap из котов Есть класс Cat, с полем имя
 * (name, String).Создать коллекцию HashMap<String, Cat>.
 * Добавить в коллекцию 10 котов, в качестве ключа использовать
 * имя кота. Вывести результат на экран, каждый элемент с новой строки.
 *
 * @author Artem Matveychuk
 */
public class HashMapCatWork {
    public static void main(String[] args) throws Exception {
        String nameCats[] = new String[]{
                "серый", "мурзик", "рыжий", "борис", "босс",
                "бред", "ворчун", "кубик", "николь", "хаб"
        };

        Map<String, Cat> map = addCatsToMap(nameCats);

        map.forEach((k, v) ->
                System.out.println(k + "-" + v));

    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        HashMap<String, Cat> temp = new HashMap<>();

        for (String name : cats) {
            temp.put(name, new Cat(name));
        }

        return temp;
    }

    // Вложенный класс
    public static class Cat {
        String name;

        Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return name == null ? null : name.toUpperCase();
        }
    }
}
