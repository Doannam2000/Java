package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class date {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args)
	{
		Date n = new Date();
		String myTime = sdf.format(n);
		System.out.println(myTime);
	}
}
