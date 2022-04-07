package Day1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tym {
    public static void main(String args[]){
        Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat ft = new SimpleDateFormat ("E MM.dd.yyyy hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(d));

    }
}
