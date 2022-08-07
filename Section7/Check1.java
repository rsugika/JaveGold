import java.util.ArrayList;
import java.util.List;

public class Check1 {
    public static void main(String[] artgs) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(10));
        list.add(new Integer(20));
        list.add(new Integer(30));
        
        for (int i = 0; i < list.size(); i++) {
            Integer obj = list.get(i);
            int num = obj.intValue();
            System.out.println(num);
        }
    }
}