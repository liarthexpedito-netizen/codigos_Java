package data_hora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Date_calendar {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date data1 = new Date();
        Date data2 = new Date(System.currentTimeMillis());
        Date data3 = new Date(0L);
        Date data4 = new Date(1000L * 60L * 60L * 5L);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);

        Date dt1 = sdf1.parse("07/08/2026");
        Date dt2 = sdf2.parse("07/08/2026 09:50:10");
        Date dt3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println("=====================");
        System.out.println(sdf2.format(data1));
        System.out.println(sdf2.format(data2));
        System.out.println(sdf2.format(data3));
        System.out.println(sdf2.format(data4));
        System.out.println(sdf2.format(dt1));
        System.out.println(sdf2.format(dt2));
        System.out.println(sdf2.format(dt3));
        System.out.println("=====================");
        System.out.println(sdf3.format(data1));
        System.out.println(sdf3.format(data2));
        System.out.println(sdf3.format(data3));
        System.out.println(sdf3.format(data4));
        System.out.println(sdf3.format(dt1));
        System.out.println(sdf3.format(dt2));
        System.out.println(sdf3.format(dt3));

    }
}
