package пятнадцать;

class Pool {
    String name;
    int yearOfConstruction;
    int maxVisitorsPerShift;
    int price;

    public Pool(String name, int yearOfConstruction, int maxVisitorsPerShift, int price) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.maxVisitorsPerShift = maxVisitorsPerShift;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Бассейн{" +
                "Название='" + name + '\'' +
                ", Год строительства=" + yearOfConstruction +
                ", Максимальное количество посетителей=" + maxVisitorsPerShift +
                ", Цена посещения=" + price +
                '}';
    }
}
