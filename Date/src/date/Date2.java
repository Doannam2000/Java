package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Date2 {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String []args)
	{
		/*
		 * D: dd/MM/yy
		 * A: thứ trong tuần
		 * T : thời gian (24h)
		 * https://www.tutorialspoint.com/java/java_date_time.htm
		 */
		LocalDate localdate= LocalDate.now();
		System.out.println(localdate);
		LocalDate mydate = LocalDate.of(2000 , 11, 19);
		System.out.println(mydate);
		mydate=mydate.plusDays(100000);
		System.out.println(mydate);
		System.out.printf("%tD\n",localdate);
		String x ="1231586";
		int p = Integer.parseInt(x);
		System.out.println(p + 3000000);
	}
}
