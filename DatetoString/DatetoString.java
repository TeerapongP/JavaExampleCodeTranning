package DatetoString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DatetoString {
    public static void main(String[] args) {
        // Example usage
        String dateString = "05-12-2023";
        Date date = convertStringToDate(dateString);
        System.out.println(date);
    }

    static Date convertStringToDate(String dateString) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date;
        try {
            date = format.parse(dateString);
        } catch (ParseException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex.getMessage());
        }
        return date;
    }
}
