import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Check4 {
    // プロセッサnotnullvalidatorを使用した入力チェックのプログラム
    public static void main(String[] args) {    
        Sample4 sample = new Sample4(null);
        List<String> messages = NotNullValidator.validate(sample);
        if (messages.isEmpty()) {
            System.out.println("valid Object");
            return;
        }
        for (String message : messages) {
            System.out.println(message);
        }
    }
}


// @Targetアノテーションを付与する先をフィールドとする定義
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface NotNull {
    String message();
}

// フィールドに対してNotNullアノテーションを付与
class Sample4 {
    @NotNull(message = "name is not allowed null")
    private String name;
    public Sample4(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

class NotNullValidator {
    public static List<String> validate(Object target) {
        try {
            List<String> message = new ArrayList<String>();
            Class clazz = target.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                NotNull annotation = field.getAnnotation(NotNull.class);
                if (annotation == null) {
                    continue;
                }

                if (field.get(target) != null) {
                    continue;
                }
                message.add(annotation.message());
            }
            return message;
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}