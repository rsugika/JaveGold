import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Check16 {
    public static void main(String[] args) {
        DateTimeFormatter isoFormat = DateTimeFormatter.ISO_DATE;
        System.out.println(isoFormat.format(LocalDate.now()));

        DateTimeFormatter isoFormatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(isoFormatter2.format(LocalDate.now()));



        // Locale.setDefault(Locale.JAPAN);
        Locale.setDefault(Locale.US);
        DateTimeFormatter a = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter b = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter c = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter e = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate date = LocalDate.now();

        System.out.println(a.format(date));
        System.out.println(b.format(date));
        System.out.println(c.format(date));
        System.out.println(e.format(date));
    }
}