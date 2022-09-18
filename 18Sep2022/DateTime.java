import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTime {
	public static void main(String[] args) {
		Date current=new Date();
		System.out.println(current);
		SimpleDateFormat currentTime=new SimpleDateFormat("hh:mm:ss");
		System.out.println("Time: "+currentTime.format(current));
		SimpleDateFormat currentDate=new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("Date: "+currentDate.format(current));
		SimpleDateFormat currentDay=new SimpleDateFormat("DD");
		System.out.println("Day: "+currentDay.format(current)+"/365");
	}
}
