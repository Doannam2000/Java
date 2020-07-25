package Ontap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class RunMain2 {
	public static boolean GhiFile(ArrayList<NhanVien> x,String path)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			for(NhanVien i:x)
			{
				String line = i.toString();
				bw.write(line);
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
	public static ArrayList<NhanVien> DocFile(String path)
	{
		ArrayList<NhanVien> Nv = new ArrayList<NhanVien>();
		try
		{
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String m = br.readLine();
			while(m!=null)
			{
				NhanVien Nvp = new NhanVien();
				String []arr=m.split("	");
				if(arr.length==3)
				{
					Nvp.setMa(arr[0]);
					Nvp.setTen(arr[1]);
					Nvp.setNgaySinh(FormatDate.FormatToDate(arr[2]));
					Nv.add(Nvp);
				}
				m=br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return Nv;
	}
	public static void main(String[] args) 
	{
		ArrayList<NhanVien> a = new ArrayList<NhanVien>();
		a.add(new NhanVien("123","Nam",FormatDate.FormatToDate("19/11/2000")));
		a.add(new NhanVien("345","Gì Đó",FormatDate.FormatToDate("20/11/2000")));
		boolean x=GhiFile(a,"F:/Code/Java/OnTapFile.txt");
		if(x== true)
			System.out.println("Ok rồi");
		else
			System.out.println("Không ổn rồi check lại lỗi đi");
		ArrayList<NhanVien> Nv = new ArrayList<NhanVien>();
		Nv = DocFile("F:/Code/Java/OnTapFile.txt");
		for(NhanVien i:Nv)
		{
			System.out.println(i);
		}
	}
}
