package test;


import main.UseCase8TrainConsistMgmt;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

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

public class UseCase8TrainConsistMgmtTest {

    @Test
    public void testFilterPassengerBogies() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Goods", 100, "Goods"));

        List<?> result = UseCase8TrainConsistMgmt.filterPassengerBogies((List) bogies);

        assertEquals(2, result.size());
    }
}
