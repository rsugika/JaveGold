import java.util.HashMap;
import java.util.Map;

public class Check14 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("ONE", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.keySet().stream().forEach(key -> {
            System.out.println(map.get(key));
        });
    }
}
