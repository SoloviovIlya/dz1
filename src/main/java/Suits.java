public enum Suits {
    CLUBS ("Трефы"),
    DIAMONDS ("Буби"),
    HEARTS ("Черви"),
    SPADES ("Пики");
    private String name;
    Suits(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
