package Ontap;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate 
{
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static Date FormatToDate(String d)
	{
		try
		{
			Date date = sdf.parse(d);
			return date;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	public static String FormatToString(Date d)
	{
		return sdf.format(d);
	}
}
