package FileBangScanner;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		try
		{
			Scanner readFile = new Scanner(new File("F:\\Code\\Java\\FileScanner.txt"),"UTF-8");
			PrintWriter printwriter = new PrintWriter("F:\\Code\\Java\\FileScanner.dat");
			while(readFile.hasNextLine())
			{
				String input = readFile.nextLine();
				printwriter.println(input);
				System.out.println(input);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
