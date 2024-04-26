package четырнадцать;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Создаем коллекцию объектов типа String
        ArrayList<String> fishCollection = new ArrayList<>();
        fishCollection.add("Лосось");
        fishCollection.add("Тунец");
        fishCollection.add("Треска");
        fishCollection.add("Треска");
        fishCollection.add("Форель");

        // Выводим коллекцию на входе
        System.out.println("Коллекция на входе: " + fishCollection);

        // Получить коллекцию без дубликатов
        ArrayList<String> uniqueFishCollection = new ArrayList<>(fishCollection);
        uniqueFishCollection = new ArrayList<>(new HashSet<>(uniqueFishCollection));
        System.out.println("Коллекция без дубликатов: " + uniqueFishCollection);

        // Отсортировать элементы
        Collections.sort(fishCollection);
        System.out.println("Отсортированная коллекция: " + fishCollection);

        // Заменить элемент (элементы)
        fishCollection.set(2, "Осетр");
        System.out.println("Коллекция после замены элемента: " + fishCollection);

        // Обменять значения двух элементов
        Collections.swap(fishCollection, 0, 4);
        System.out.println("Коллекция после обмена элементов: " + fishCollection);

        // Удалить последний элемент
        fishCollection.remove(fishCollection.size() - 1);
        System.out.println("Коллекция после удаления последнего элемента: " + fishCollection);
    }
}