package MyJavaProject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;


public class Time {
    public static void main(String[] args) {
        //Stowatch Method
        // Timer Method
        Date myDate = Calendar.getInstance().getTime();
        DateFormat myFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String timeDate = myFormat.format(myDate);

        StopWatch sw = new StopWatch();
        sw.Stop();
        System.out.println(timeDate);
        Timer timer = new Timer();
        timer.Display();
        System.out.println(timeDate);

    }

    LocalDateTime myTime =  LocalDateTime.now();
}
