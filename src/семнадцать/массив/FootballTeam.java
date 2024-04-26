package семнадцать.массив;

import java.util.Arrays;

public class FootballTeam {
    private String name;
    private String city;
    private int leaguePosition;
    private int wins;
    private Coach[] coaches;

    public FootballTeam(String name, String city, int leaguePosition, int wins, Coach[] coaches) {
        this.name = name;
        this.city = city;
        this.leaguePosition = leaguePosition;
        this.wins = wins;
        this.coaches = coaches;
    }
    public String getName() {
        return name;
    }

//    public String getCity() {
//        return city;
//    }

//  public int getLeaguePosition() {
//        return leaguePosition;
//    }

    public int getWins() {
        return wins;
    }

//    public void setWins(int wins) {
//        this.wins = wins;
//    }
    public Coach[] getCoaches() {
        return coaches;
    }

//    public void setCoaches(Coach[] coaches) {
//        this.coaches = coaches;
//    }
    @Override
    public String toString() {
        return "Футбольная команда{" +
                "Название='" + name + '\'' +
                ", Город='" + city + '\'' +
                ", Место в лиге=" + leaguePosition +
                ", Количество побед=" + wins +
                ", Тренеры=" + Arrays.toString(coaches) +
                '}';
    }
}