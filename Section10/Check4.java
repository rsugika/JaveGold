import java.util.Locale;

public class Check4 {
    public static void main(String[] args) {
        Locale locale = new Locale("ja", "JP", "JP");
        System.out.println(locale.toLanguageTag());

        Item4 a = new Item4.Builder()
                        .setName("Sample")
                        .build();
        System.out.println(a.getName());
    }

    Locale locale1 = new Locale.Builder()
                        .setLanguage("jp")
                        .setRegion("JP")
                        .setScript("Jpan")
                        .build();
}

class Item4 {
    private String name;
    public static class Builder {
        private String name;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Item4 build() {
            if (this.name == null) {
                throw new IllegalStateException();
            }
            Item4 item = new Item4();
            item.name = this.name;
            return item;
        }
    }
    public String getName() {
        return name;
    }
}