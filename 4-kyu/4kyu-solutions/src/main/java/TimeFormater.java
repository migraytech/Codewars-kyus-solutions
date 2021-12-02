import com.sun.javafx.binding.StringFormatter;

import javax.xml.datatype.Duration;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormater {


    private static String result;

//    assertEquals("1 second", TimeFormatter.formatDuration(1));
//    assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
//    assertEquals("2 minutes", TimeFormatter.formatDuration(120));
//    assertEquals("1 hour", TimeFormatter.formatDuration(3600));
//    assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));


    //If zero, it just returns "now"
    //a year is 365 days and a day is 24 hours.
    public static void main(String[] args) {
        int second = 1;
        int minute_seconds= 62;
        int two_minutes= 120;
        int hour = 3600;
        int hour_two_seconds = 3662;

       System.out.println(formatDuration(second));
    }

    public static String formatDuration(int seconds) {

        if(seconds == 0)
            return "now";
        return "";
    }

    public static String formatIntToString(String value, int seconds)
    {


        return null;

    }






}




