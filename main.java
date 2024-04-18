import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

    public static void main(String[] args) throws IOException {

        System.out.println("Добро пожаловать в магазин игрушек!");

        ArrayList<Toy> toys1 = new ArrayList<>(List.of(
                new Toy(1, "Машинка", 3),
                new Toy(2, "Робот", 5),
                new Toy(3, "Мягкая игрушка", 2)));
                new Toy(1, "Машинка", 30),
                new Toy(2, "Робот", 50),
                new Toy(3, "Мягкая игрушка", 20)));
        ArrayList<Toy> toys2 = new ArrayList<>(List.of(
                new Toy(1, "Машинка", 3),
                new Toy(2, "Робот", 5),
                new Toy(3, "Мягкая игрушка", 2)));
                new Toy(1, "Машинка", 30),
                new Toy(2, "Робот", 50),
                new Toy(3, "Мягкая игрушка", 20)));
        ArrayList<Toy> toys3 = new ArrayList<>(List.of(
                new Toy(1, "Машинка", 3),
                new Toy(2, "Робот", 5),
                new Toy(3, "Мягкая игрушка", 2)));
                new Toy(1, "Машинка", 30),
                new Toy(2, "Робот", 50),
                new Toy(3, "Мягкая игрушка", 20)));
        ToyStore toyStore = new ToyStore();
        toyStore.put(toys1);
        toyStore.put(toys2);
        toyStore.put(toys3);
        System.out.println(toyStore.getToy());
        System.out.println(toyStore.getToy());
        System.out.println(toyStore.getToy());
    }
}

