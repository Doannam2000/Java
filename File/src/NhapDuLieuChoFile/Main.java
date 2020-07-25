package NhapDuLieuChoFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
public class Main {
	public static boolean TepTin(ArrayList<String> hi,String path)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			for(String x: hi)
			{
				bw.write(x);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	public static ArrayList DocFile(String path)
	{
		ArrayList<String> hi = new ArrayList<String>();
		try
		{
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while(line!=null)
			{
				if(line.length()>0)
					hi.add(line);
				line=br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return hi;		
	}
	public static void main(String []args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("đmm");
		a.add("Chửi thề con cặc");
		a.add("Tao có súng á");
		a.add("Tao bắn á");
		a.add("Ahihi");
		boolean p = TepTin(a,"F:\\Code\\Java\\DuLieuNhap.txt");
		if(p==true)
			System.out.println("OK rồi");
		else
			System.out.println("Đéo được");
		ArrayList<String> b = new ArrayList<String>();
		b = DocFile("F:\\Code\\Java\\DuLieuNhap.txt");
		for(String x:b)
		{
			System.out.println(x);
		}
		
	}

}
