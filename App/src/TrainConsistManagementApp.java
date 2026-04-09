import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Step 1: Create Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("=== Bogies Sorted by Capacity (Ascending) ===");

        for (Bogie b : bogieList) {
            b.display();
        }
        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\n=== Bogies Sorted by Capacity (Descending) ===");

        for (Bogie b : bogieList) {
            b.display();
        }
    }
}