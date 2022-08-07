import java.util.Locale;

class Check1 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        // display country
        System.out.println(locale.getCountry());
        // display language
        System.out.println(locale.getLanguage());
    }
}