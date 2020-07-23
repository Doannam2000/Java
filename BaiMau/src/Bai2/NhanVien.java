package Bai2;

import java.util.Scanner;
public class NhanVien 
{
	Scanner input = new Scanner(System.in);
	private int maNv;
	private String hoDem;
	private String ten;
	 Date ngaySinh;
	 PhongBan phong;
	void Nhap()
	{
		ngaySinh = new Date();
		phong = new PhongBan();
		System.out.print("Nhập mã nhân viên :");
		maNv = input.nextInt();
		input.nextLine();
		System.out.print("Nhập họ :");
		hoDem = input.nextLine();
		System.out.print("Nhập tên :");
		ten = input.nextLine();
		System.out.print("Nhập ngày tháng năm sinh :");
		ngaySinh.setDay(input.nextInt());
		ngaySinh.setMonth(input.nextInt());
		ngaySinh.setYear(input.nextInt());
		System.out.println("Nhập mã phòng :");
		phong.setMaPb(input.nextInt());
		input.nextLine();
		System.out.println("Nhập tên phòng :");
		phong.setTenPb(input.nextLine());
		System.out.println("Nhập tên trưởng phòng :");
		phong.setTruongPhong(input.nextLine());
		System.out.println("Nhập số nhân viên :");
		phong.setSoNv(input.nextInt());
	}
	void Xuat()
	{
		System.out.printf("%15d" , maNv);
		System.out.printf("%15s" , hoDem);
		System.out.printf("%15s" , ten);
		System.out.printf("%15s" , ngaySinh.getDay() +"/"+ ngaySinh.getMonth()+"/" +ngaySinh.getYear());
		System.out.printf("%15d" , phong.getMaPb());
		System.out.printf("%15s" , phong.getTenPb());
		System.out.printf("%15s" , phong.getTruongPhong());
		System.out.printf("%15d" , phong.getSoNv());
		System.out.println("");
	}
	
	public int getMaNv() {
		return maNv;
	}
	public void setMaNv(int maNv) {
		this.maNv = maNv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	Boolean P()
	{
		String x=phong.getTenPb();
		if(phong.getTenPb().compareToIgnoreCase("Tài Chính")==0)
			return true;
		return false;
	}
}