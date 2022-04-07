package Day1;

import java.util.Calendar;

public class CC {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.add(Calendar.DATE, +2);
        System.out.println(c.getTime());
        
    }
}
