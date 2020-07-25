package Ontap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
	public static boolean GhiFile(Object x,String path)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Object m = x.toString();
			oos.writeObject(m);
			oos.close();
			fos.close();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	public static Object DocFile(String path)
	{
		try
		{
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<NhanVien> Nv = new ArrayList<NhanVien>();
			String m =(String)ois.readObject();
			ois.close();
			fis.close();
			return m;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) 
	{
		ArrayList<NhanVien> a = new ArrayList<NhanVien>();
		a.add(new NhanVien("123","Nam",FormatDate.FormatToDate("19/11/2000")));
		a.add(new NhanVien("345","Gì Đó",FormatDate.FormatToDate("20/11/2000")));
		boolean x=GhiFile(a,"F:/Code/Java/OnTapFile.dat");
		if(x== true)
			System.out.println("Ok rồi");
		else
			System.out.println("Không ổn rồi check lại lỗi đi");
		Object m = DocFile("F:/Code/Java/OnTapFile.dat");
		String b = (String)m;
		System.out.println(b);
	}
}
