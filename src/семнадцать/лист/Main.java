package семнадцать.лист;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        List<Coach> coaches1 = new ArrayList<>();
        coaches1.add(new Coach("Иванов", 10));
        coaches1.add(new Coach("Петров", 8));
        teams.add(new FootballTeam("Команда1", "Москва", 2, 20, coaches1));

        List<Coach> coaches2 = new ArrayList<>();
        coaches2.add(new Coach("Сидоров", 12));
        coaches2.add(new Coach("Кузнецов", 7));
        teams.add(new FootballTeam("Команда2", "Санкт-Петербург", 1, 25, coaches2));

        List<Coach> coaches3 = new ArrayList<>();
        coaches3.add(new Coach("Александров", 9));
        coaches3.add(new Coach("Федоров", 11));
        teams.add(new FootballTeam("Команда3", "Москва", 3, 18, coaches3));


        //поиск по названию команды, исправление стажа одного из тренеров и вывод полной информации о команде после редактирования
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

