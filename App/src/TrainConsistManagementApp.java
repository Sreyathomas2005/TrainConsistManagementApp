import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Rectangular Goods", 100);
        bogieCapacityMap.put("Cylindrical Goods", 120);

        System.out.println("=== Train Bogie Capacity Details ===");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        String searchBogie = "Sleeper";
        if (bogieCapacityMap.containsKey(searchBogie)) {
            System.out.println("\nCapacity of " + searchBogie + " Bogie: "
                    + bogieCapacityMap.get(searchBogie));
        } else {
            System.out.println("\nBogie not found!");
        }
    }
}