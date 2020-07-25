package Find;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
	public static void main(String[]args)
	{
		String input ="     Ahihi     cái con c    ";
		String find = "[\\s]+";
		Pattern pattern = Pattern.compile(find);
		Matcher matcher= pattern.matcher(input);
		if(matcher.find())
		{
			System.out.println(matcher.replaceAll("-"));
		}
	}
}
