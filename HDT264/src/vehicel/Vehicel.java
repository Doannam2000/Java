package vehicel;

import java.util.Scanner;

public class Vehicel {
	static Scanner input = new Scanner(System.in);
	protected String NhanHieu;
	protected int NamSX;
	protected String Hang;
	void Nhap()
	{
		System.out.println("Nhập Nhãn Hiệu xe :");
		NhanHieu = input.nextLine();
		System.out.println("Nhập Năm Sản Xuất :");
		NamSX = input.nextInt();
		System.out.println("Nhập Hãng:");
		Hang = input.nextLine();
	}
	void Xuat()
	{
		System.out.printf("%15s","Nhãn Hiệu");
		System.out.printf("%15d","Năm");
		System.out.printf("%15s","Hãng");
	}
	public String getNhanHieu() {
		return NhanHieu;
	}
	public void setNhanHieu(String nhanHieu) {
		NhanHieu = nhanHieu;
	}
	public int getNamSX() {
		return NamSX;
	}
	public void setNamSX(int namSX) {
		NamSX = namSX;
	}
	public String getHang() {
		return Hang;
	}
	public void setHang(String hang) {
		Hang = hang;
	}
}
