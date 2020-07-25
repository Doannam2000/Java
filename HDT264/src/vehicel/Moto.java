package vehicel;

import java.util.Scanner;

public class Moto extends Vehicel
{
	static Scanner input = new Scanner(System.in);
	private int PhanKhoi;
	void Nhap()
	{
		System.out.println("Nhập Phân khối : ");
		PhanKhoi = input.nextInt();
	}
	void Xuat()
	{
		System.out.printf("%15d",PhanKhoi);
	}
}
