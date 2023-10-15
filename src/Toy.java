public class Toy {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int chance;

    {
        id = idCounter++;
    }

    public Toy(String name, int chance) {
        this.name = name;
        this.chance = chance;
    }

    public int getChance() {
        return chance;
    }
    @Override
    public String toString() {
        return String.format("№ %d. %s, вероятность выпадения %d", id, name, chance);
    }
}
