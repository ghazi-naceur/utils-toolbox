package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Ghazi Ennacer on 27/12/2017.
 */
public class DateUtilities {

    public DateUtilities() {
        super();
    }

    public static Date parseDate(String date, String pattern) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.parse(date);
    }

    public static Date parseDateInUTCTimeZone(String date,String pattern, TimeZone timeZone) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        format.setTimeZone(timeZone);
        return format.parse(date);
    }
}
