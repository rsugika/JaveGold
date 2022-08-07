import java.util.HashMap;
import java.util.Map;

public class Check15 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("two", 2);
        map.put("three", 3);

        map.entrySet()
        .stream()
        .forEach((Map.Entry<String, Integer> entry) -> {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + ":" + val);       
        });
    }
}
