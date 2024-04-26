package шестнадцать;

import java.util.Scanner;

public class WithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите символьную строку русского алфавита:");
            String input = scanner.nextLine();

            if (input.length() < 3) {
                throw new IllegalArgumentException("Введено только два символа.");
            }

            char firstChar = findFirstChar(input);
            char lastChar = findLastChar(input);

            System.out.println("Первый символ встречающийся в алфавите: " + firstChar);
            System.out.println("Последний символ встречающийся в алфавите: " + lastChar);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static char findFirstChar(String input) {
        for (char c : input.toCharArray()) {
            if (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CYRILLIC) {
                return c;
            }
        }
        throw new IllegalArgumentException("Не найден символ русского алфавита.");
    }

    public static char findLastChar(String input) {
        char lastChar = 0;
        for (char c : input.toCharArray()) {
            if (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CYRILLIC) {
                lastChar = c;
            }
        }
        if (lastChar == 0) {
            throw new IllegalArgumentException("Не найден символ русского алфавита.");
        }
        return lastChar;
    }
}
