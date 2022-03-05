package yhummyChild;
import java.io.*;
public class Day12_java_date_and_time {
    public static void main(String[] args){
       SimpleDateFormat sdf = new SimpleDateFormat ("EEEE");
       Calendar calendar = new GregorianCalendar (year, month-1, day);
       String hari = sdf.format(calendar.getTime());
       hari = hari.toUpperCase();
       return hari;
    }    
}    
    

