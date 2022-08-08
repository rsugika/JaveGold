import java.io.ObjectStreamField;
import java.io.Serializable;

public class Check12 {
    public static void main(String[] args) {

    }
}

class Employy12 implements Serializable {
    private String name;
    // シリアライズから除外
    private transient String telephone;

    private static final ObjectStreamField[] serialPersistentFields = {

    };
}
