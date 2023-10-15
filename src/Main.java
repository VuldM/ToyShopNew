public class Main {
    public static void main(String[] args) {
        Toy[] toy = {
                new Toy("Кукла", 2),
                new Toy("Мячик", 1),
                new Toy("Карандаши цветные",3),
                new Toy("Плюшевый заяц", 5),
                new Toy("Самолетик", 6),
                new Toy("Пирамидка", 4),
                new Toy("Юла", 7),
                new Toy("Пупс",2),
                new Toy("Неваляшка",4)
        };
        Shop shop = new Shop();
        for (Toy toys: toy) {
            shop.addToy(toys);
        }
        for (Toy toys: toy) {
            System.out.println(shop.getToy().toString());
        }
    }
}