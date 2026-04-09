package test;

import main.UseCase9TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    @Test
    void testGrouping_BogiesGroupedByType() {
        List<main.Bogie> bogies = new ArrayList<>();
        bogies.add(new main.Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new main.Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new main.Bogie("First Class", 24, "Passenger"));
        bogies.add(new main.Bogie("Rectangular", 100, "Goods"));

        Map<String, List<main.Bogie>> grouped = UseCase9TrainConsistMgmt.groupBogiesByType(bogies);

        assertTrue(grouped.containsKey("Passenger"));
        assertEquals(3, grouped.get("Passenger").size());

        assertTrue(grouped.containsKey("Goods"));
        assertEquals(1, grouped.get("Goods").size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<main.Bogie> bogies = new ArrayList<>();
        Map<String, List<main.Bogie>> grouped = UseCase9TrainConsistMgmt.groupBogiesByType(bogies);

        assertTrue(grouped.isEmpty());
    }
}