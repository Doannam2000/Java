package Bai1;

import java.util.Scanner;

public class NhanSu {
	Scanner in = new Scanner(System.in);
	private int maNs;
	private String hoDem;
	private String ten;
	private int namSinh;
	private String gioiTinh;

	public int getMaNs() {
		return maNs;
	}

	public void setMaNs(int maNs) {
		this.maNs = maNs;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public void Nhap() {
		System.out.println("=======Nhập thông tin nhân sự======");
		System.out.printf("\tNhập mã nhân sự:");
		maNs = in.nextInt();
		in.nextLine();
		System.out.printf("\tNhập họ đệm:");
		hoDem = in.nextLine();
		System.out.printf("\tNhập tên:");
		ten = in.nextLine();
		System.out.printf("\tNhập năm sinh:");
		namSinh = in.nextInt();
		in.nextLine();
		System.out.printf("\tNhập giới tính:");
		gioiTinh = in.nextLine();
	}

	public void Xuat() {

		System.out.printf("%10d", maNs);
		System.out.printf("%10s", hoDem);
		System.out.printf("%10s", ten);
		System.out.printf("%10d", namSinh);
		System.out.printf("%10s", gioiTinh);
	}
}
