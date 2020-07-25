package OnTap2;

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
			oos.writeObject(x);
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
	public static ArrayList<NhanVien> DocFile(String path)
	{
		ArrayList<NhanVien> Nv=new ArrayList<NhanVien>();
		try
		{
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			Nv = (ArrayList<NhanVien>)data;
			ois.close();
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
		a.add(new NhanVien("123","Nam",19000000));
		a.add(new NhanVien("345","Gì Đó",20000000));
		boolean x=GhiFile(a,"F:/Code/Java/OnTapFile.dat");
		if(x== true)
			System.out.println("Ok rồi");
		else
			System.out.println("Không ổn rồi check lại lỗi đi");
		ArrayList<NhanVien> NV = new ArrayList<NhanVien>();
		NV = DocFile("F:/Code/Java/OnTapFile.dat");
		for(NhanVien i:NV)
		{
			System.out.println(i);
		}
	}
}
