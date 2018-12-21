import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        DateTime now = new DateTime();
        System.out.println("Now: " + now);

        //Updated Date
        DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd");
        String str = format.print(now);
        System.out.println("Formatted: " + str);

        //Convert string date to datetime
        DateTime convertedStringtoDate = format.parseDateTime(str);
        System.out.println("Converted: " + convertedStringtoDate);

        //Fixed Date
        //String dateTime = "11/15/2013 08:00:00";
        String dateTime = "05/22/2018 08:00:00";
        DateTimeFormatter oldFormat = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
        DateTime fixedDate = oldFormat.parseDateTime(dateTime);
        System.out.println("Old Date: " + format.print(fixedDate));

        if (convertedStringtoDate.equals(fixedDate)) {
            System.out.println("Same value");
        } else {
            System.out.println("Different");
        }

        String var1 = str.toString();
        String var2 = convertedStringtoDate.toString();
        String var3 = fixedDate.toString();

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

        if (var1.equals(var2)) {
            System.out.println("Same value");
        } else {
            System.out.println("Different");
        }

        if (var2.equals(var3)) {
            System.out.println("Same value");
        } else {
            System.out.println("Different");
        }

        if (var1.equals(var3)) {
            System.out.println("Same value");
        } else {
            System.out.println("Different");
        }
    }
}