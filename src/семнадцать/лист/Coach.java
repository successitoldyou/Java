package семнадцать.лист;

public class Coach {
    private String lastName;
    private int experience;

    public Coach(String lastName, int experience) {
        this.lastName = lastName;
        this.experience = experience;
    }

    public String getLastName() {
        return lastName;
    }

    //public int getExperience() {
       // return experience;
    //}

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Тренер{" +
                "Фамилия='" + lastName + '\'' +
                ", Стаж=" + experience +
                '}';
    }
}
