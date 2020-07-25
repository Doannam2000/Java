package NhapDuLieuChoFile;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Nhap {
	public static boolean TepTin(ArrayList<String> hi,String path)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos ,"UTF-8"); 
			BufferedWriter Bw = new BufferedWriter(osw);
			for(String x:hi)
			{
				Bw.write(x);
				Bw.newLine();
			}
			Bw.close();
			osw.close();
			fos.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	public static void Main(String []args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ahihi");
		a.add("Chửi thề con cặc");
		a.add("Tao có súng á");
		a.add("Tao bắn á");
		boolean x = TepTin(a,"F:\\Code\\Java");
		if(x == true)
			System.out.println("OK rồi");
		else
			System.out.println("Đéo được");
	}
}
