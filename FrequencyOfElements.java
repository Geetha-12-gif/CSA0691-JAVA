import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        
        // Step 1: Create a HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Step 2: Calculate frequencies of each element
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                // If the number is already present in the map, increment its count
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the number is not present in the map, add it with count 1
                frequencyMap.put(num, 1);
            }
        }
        
        // Step 3: Print the frequencies in the specified format
        System.out.println("Element | Frequency");
        System.out.println("------------------");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.printf("%-8d| %-8d\n", entry.getKey(), entry.getValue());
        }
    }
}
