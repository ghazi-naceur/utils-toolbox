package date;

import org.junit.Test;

import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Ghazi Ennacer on 27/12/2017.
 */
public class DateUtilitiesTest {

    @Test
    public void parseDate() {
        try {
            Date date = DateUtilities.parseDate("27/12/2017 12:30:00", "dd/mm/yyyy hh:mm:ss");
            System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parseDateInUTCTimeZone() throws ParseException {
        Date date = DateUtilities.parseDateInUTCTimeZone("27/12/2017 12:30:00", "dd/mm/yyyy hh:mm:ss", TimeZone.getDefault());
        System.out.println(date);
    }
}
