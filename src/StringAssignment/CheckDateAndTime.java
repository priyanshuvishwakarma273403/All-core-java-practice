package StringAssignment;

import java.util.Calendar;

public class CheckDateAndTime {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getWeekYear());
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month"+c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.MILLISECOND));
    }
}
