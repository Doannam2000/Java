package vehicel;

import java.util.Scanner;

public class OTO extends Vehicel
{
	static Scanner input = new Scanner(System.in);
	private int SCN;
	private int DungTich;
	void Nhap()
	{	
		Vehicel:Nhap();
		System.out.println("Nhập số chỗ ngồi :");
		SCN = input.nextInt();
		System.out.println("Nhập dung tích :");
		DungTich = input.nextInt();
	}
	void Xuat()
	{
		System.out.printf("%15d",SCN);
		System.out.printf("%15d",DungTich);
	}
	public int getSCN() {
		return SCN;
	}
	public void setSCN(int sCN) {
		SCN = sCN;
	}
	public int getDungTich() {
		return DungTich;
	}
	public void setDungTich(int dungTich) {
		DungTich = dungTich;
	}
	
}
