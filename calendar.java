
import java.util.*;
public class CALENDAR {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        System.out.println("\nCurrent Date and Time:" + cal.getTime());
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        
        System.out.println("Year: "+ year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Minute: " + minute);
        System.out.println("Hour: " + hour );
        System.out.println("Christmas Day! \nMerry Christmas, Everyone!");
    }
    
}
