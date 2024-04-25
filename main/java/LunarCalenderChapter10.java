import static java.lang.System.out;
import java.util.Calendar;
import java.util.TimeZone;
public class LunarCalenderChapter10 {


    public class FullMoons {
        static int DAY_IM = 1000 * 60 * 60 * 24;

        public static void main(String[] args) {
            Calendar c = Calendar.getInstance(TimeZone.getTimeZone("MST"));
            c.set(2004, 0, 7, 15, 40); // Starting date is Jan 7, 2004, 15:40 MST
            long day1 = c.getTimeInMillis();


            for (int x = 0; x < 60; x++) {
                day1 += (DAY_IM * 29.52); // Full moon cycle is roughly every 29.52 days
                c.setTimeInMillis(day1);
                out.println(String.format("full moon on %tc", c));
            }
        }
    }

}
