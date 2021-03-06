package Object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RunMain {
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
	public static Object DocFile(String path)
	{
		try
		{
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object x = ois.readObject();
			ois.close();
			fis.close();
			return x;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) 
	{
		ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
		sv.add(new SinhVien("ĐMM Cuối cùng mày cũng được",0));
		sv.add(new SinhVien("Má nhà mày tốn thời gian vl",0));
		boolean x = GhiFile(sv,"F:/Code/Java/ObjectFile.dat");
		if(x==true)
			System.out.println("Không được nữa bố đập mẹ mày ra");
		else
			System.out.println("Không được rồi thằng ngu kia");
		Object data = new ArrayList<SinhVien>();
		data = DocFile("F:/Code/Java/ObjectFile.dat");
		ArrayList<SinhVien> gi = (ArrayList<SinhVien>) data;
		for(SinhVien m:gi)
		{
			System.out.println(m.getTen() +"\t"+m.getDiem());
		}
	}
	
}
