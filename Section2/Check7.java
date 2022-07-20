package Section2;

import java.util.function.Predicate;
import Section2.Person.Gender;

public class Check7 {
    public static void main(String[] args) {
        new OldSample().main();
        new NewSample().main();
    }
}


class Person {
    public enum Gender {
        MALE, FEMALE
    }
    private Gender gender;
    private int age;
    public Person(Gender gender, int age) {
        super();
        this.gender = gender;
        this.age = age;
    }
    public Gender getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
}


/***
 * 論理演算子の組み合わせによる条件判定
 */

 class OldSample {
    public static void main() {
        Person sample = new Person(Gender.MALE, 19);

        if(sample.getGender().equals(Gender.MALE) || sample.getGender().equals(Gender.FEMALE) && sample.getAge() >= 20) {
            System.out.println("OK");
            return;
        }
        System.out.println("NG");
    }
}

/***
 * Predicateインターフェースのデフォルトメソッドによる条件判定
 * 
 */

 class NewSample {
    public static void main() {
        Predicate<Person> isMale = p -> p.getGender().equals(Gender.MALE);
        Predicate<Person> isFemale = p -> p.getGender().equals(Gender.FEMALE);
        Predicate<Person> isAdult = p -> p.getAge() >= 20;

        Person sample = new Person(Gender.MALE, 19);
        if (isMale.or(isFemale.and(isAdult)).test(sample)) {
            System.out.println("OK");
            return;
        }
        System.out.println("NG");
    }
 }



 class explain {
    //  Predicateインターフェースは複数を組み合わせることができる
    Predicate<String> p1 = str -> str.startsWith("a");
    Predicate<String> p2 = str -> str.endsWith("e");
    Predicate<String> p3 = p1.and(p2);
 }