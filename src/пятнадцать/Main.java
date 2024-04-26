package пятнадцать;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Pool>> map = new HashMap<>();

        List<Pool> pools1 = new ArrayList<>();
        pools1.add(new Pool("Oлимп", 2000, 500, 1000));
        pools1.add(new Pool("Прометей", 2010, 200, 500));
        map.put("Джон", pools1);

        List<Pool> pools2 = new ArrayList<>();
        pools2.add(new Pool("Райан", 2015, 300, 800));
        pools2.add(new Pool("Гослинг", 2018, 400, 1200));
        map.put("Майк", pools2);

        System.out.println("Размер мапы: " + map.size());

        System.out.println("Первая пара по ключу Джон: " + map.get("Джон").get(0));

        map.get("Джон").get(0).price = 1500;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя владельца:");
        String owner = scanner.nextLine();
        System.out.println("Количество ключей у владельца " + owner + ": " + map.get(owner).size());

        map.get(owner).get(0).maxVisitorsPerShift = 600;

        int i = 1;
        for (Map.Entry<String, List<Pool>> entry : map.entrySet()) {
            System.out.println(i + ". " + entry.getKey() + ": " + entry.getValue());
            i++;
        }
    }
}
