package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;
    String type;

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }
}

public class UseCase8TrainConsistMgmt {

    public static List<Bogie> filterPassengerBogies(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.type.equalsIgnoreCase("Passenger") && b.capacity > 50)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Rectangular", 100, "Goods"));

        List<Bogie> result = filterPassengerBogies(bogies);

        System.out.println("=== Filtered Bogies ===");
        for (Bogie b : result) {
            System.out.println(b.name + " - " + b.capacity);
        }
    }
}