package Thu;

import java.util.ArrayList;

public class RunMain {

	public static void main(String[] args) 
	{
		ArrayList<SinhVien> a =new ArrayList<SinhVien>();
		a.add(new SinhVien("Nam",10));
		a.add(new SinhVien("Gi",8));
		a.add(new SinhVien("j",4));
		a.add(new SinhVien("m",2));
		a.add(new SinhVien("a",6));
		a.add(new SinhVien("u",1));
		System.out.println("Danh Sách Sinh Vien :");
		for(SinhVien x: a)
		{
			System.out.println(x);
		}
	}
}
