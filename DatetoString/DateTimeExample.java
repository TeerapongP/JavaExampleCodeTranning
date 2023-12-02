package DatetoString;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeExample {
    public static void main(String[] args) {
        dateSimple();
    }

    static void dateSimple() {
        try {
            // Using java.time.LocalDate
            LocalDate myLocalDate = LocalDate.now();
            System.out.println("LOCAL DATE: " + myLocalDate);

            // Using java.time.LocalTime
            LocalTime myTime = LocalTime.now();
            System.out.println("LOCAL TIME: " + myTime);

            // Using java.time.LocalDateTime
            LocalDateTime myLocalDateTime = LocalDateTime.now();
            System.out.println("BEFORE FORMATTING: " + myLocalDateTime);

            // Formatting using DateTimeFormatter
            DateTimeFormatter myLocalDateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = myLocalDateTime.format(myLocalDateTimeFormat);
            System.out.println("AFTER FORMATTING: " + formattedDate);

            // Using java.util.Date (deprecated, but still works)
            System.out.println("Full Date: " + new Date());

            // Using java.text.SimpleDateFormat with java.util.Date
            SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            System.out.println("SimpleDateFormat: " + sf.format(new Date()));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
