package CheckMail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = "hi2134hi";
		//String regex ="^[a-zA-Z]+[a-zA-Z0-9]*@{1}[a-zA-Z]+mail{1}.com$";
		String regex= "^[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{2}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if(matcher.find())
		{
			System.out.println("Very Nice");
		}
		else
		{
			System.out.println("No,it's not true \nExample@gmail.com");
		}
	}
}
