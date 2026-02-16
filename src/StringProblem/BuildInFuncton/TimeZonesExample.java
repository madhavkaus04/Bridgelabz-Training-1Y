package BuildInFuncton;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class TimeZonesExample {

        public static void main(String[] args) {

            // Create formatter
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

            // GMT
            ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
            System.out.println("GMT Time: " + gmt.format(formatter));

            // IST (Asia/Kolkata)
            ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
            System.out.println("IST Time: " + ist.format(formatter));

            // PST (America/Los_Angeles)
            ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
            System.out.println("PST Time: " + pst.format(formatter));
        }
    }


