package matven.java.lab.type;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Ввести с клавиатуры два имени, и если имена одинаковые, вывести
 * сообщение «Имена идентичны». Если имена разные, но их длины
 * равны – вывести сообщение – «Длины имен равны».
 *
     * @author Artem Matveychuk
 */
public class CompareNamesWork {
    public static void main(String[] args) throws Exception {
        // прочитать вводимые данные
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Введите первое имя: ");
        String firstName = reader.readLine();

        System.out.print("Введите второе имя: ");
        String secondName = reader.readLine();

        // сравнение имен
        if (firstName.equals(secondName)) {
            System.out.print("Имена идентичны");
        } else if (firstName.length() == secondName.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
