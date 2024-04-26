package семнадцать.массив;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FootballTeam[] teams = new FootballTeam[3];

        Coach[] coaches1 = new Coach[2];
        coaches1[0] = new Coach("Иванов", 10);
        coaches1[1] = new Coach("Петров", 8);
        teams[0] = new FootballTeam("Команда1", "Москва", 2, 20, coaches1);

        Coach[] coaches2 = new Coach[2];
        coaches2[0] = new Coach("Сидоров", 12);
        coaches2[1] = new Coach("Кузнецов", 7);
        teams[1] = new FootballTeam("Команда2", "Санкт-Петербург", 1, 25, coaches2);

        Coach[] coaches3 = new Coach[2];
        coaches3[0] = new Coach("Александров", 9);
        coaches3[1] = new Coach("Федоров", 11);
        teams[2] = new FootballTeam("Команда3", "Москва", 3, 18, coaches3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите название команды для поиска и редактирования: ");
        String teamNameToEdit = scanner.nextLine();
        boolean found = false;
        for (FootballTeam team : teams) {
            if (team.getName().equalsIgnoreCase(teamNameToEdit)) {
                found = true;
                System.out.println("Найденная команда: " + team);
                System.out.print("Введите фамилию тренера для редактирования: ");
                String coachLastNameToEdit = scanner.nextLine();
                boolean coachFound = false;
                for (Coach coach : team.getCoaches()) {
                    if (coach.getLastName().equalsIgnoreCase(coachLastNameToEdit)) {
                        coachFound = true;
                        System.out.print("Введите новый стаж тренера: ");
                        int newExperience = scanner.nextInt();
                        scanner.nextLine(); // Очистка буфера
                        coach.setExperience(newExperience);
                        System.out.println("После редактирования: " + team);
                        break;
                    }
                }
                if (!coachFound) {
                    System.out.println("Тренер с такой фамилией не найден.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Команда с таким названием не найдена.");
        }
    }
}