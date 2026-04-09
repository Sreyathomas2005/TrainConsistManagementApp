package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;
    String type; // Passenger or Goods

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class UseCase9TrainConsistMgmt {

    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Rectangular", 100, "Goods"));
        bogies.add(new Bogie("Cylindrical", 120, "Goods"));

        Map<String, List<Bogie>> grouped = groupBogiesByType(bogies);

        System.out.println("=== Bogies Grouped by Type ===");
        grouped.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });
    }
}