package Chapter7;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;


public class TimeMethods {
    public static void main(String[] args) {
//        Date current_Date = new Date();
//        System.out.println(current_Date);

        System.out.println(LocalDateTime.now());

        SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
        Date date = new Date();
        currentDate.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(currentDate.format(date));
        // print formatted date and time





    }




}
