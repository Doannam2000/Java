package Bai1;

import java.util.Scanner;

public class CanBo extends NhanSu {
	Scanner in = new Scanner(System.in);
	private Phong phong;
	private String chucVu;
	private double heSoLuong;
	private String xepLoai;
	private double luong;

	public Phong getPhong() {
		return phong;
	}

	public void setPhong(Phong phong) {
		this.phong = phong;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public CanBo(Phong phong, String chucVu, double heSoLuong, String xepLoai, double luong) {
		super();
		this.phong = phong;
		this.chucVu = chucVu;
		this.heSoLuong = heSoLuong;
		this.xepLoai = xepLoai;
		this.luong = luong;
	}

	public CanBo() {
		super();
	}

	public void Nhap() {
		phong = new Phong();
		System.out.println("========Nhập thông tin của cán bộ=========");
		super.Nhap();
		System.out.printf("\tNhập chức vụ:");
		chucVu = in.nextLine();
		System.out.printf("\tNhập hệ số lương:");
		heSoLuong = in.nextDouble();
		in.nextLine();
		System.out.printf("\tNhập xếp loại:");
		xepLoai = in.nextLine();
		System.out.printf("\tNhập lương:");
		luong = in.nextDouble();
		in.nextLine();
		System.out.println("==========Nhập thông tin của phòng=========");
		System.out.printf("\tNhập tên phòng:");
		phong.setTenPhong(in.nextLine());
		System.out.printf("\tNhập trưởng phòng:");
		phong.setTruongPhong(in.nextLine());
	}


	public void Xuat() {
		System.out.printf("%13s", chucVu);
		System.out.printf("%15f", heSoLuong);
		System.out.printf("%13s", xepLoai);
		System.out.printf("%13f", luong);
		System.out.printf("%13s", phong.getTenPhong());
		System.out.printf("%13s", phong.getTruongPhong());

	}

	public double TinhLuong() {
		double S = 0;
		if (xepLoai == "A") {
			S = heSoLuong * 1150000 + 1000000;
		} else if (xepLoai == "B") {
			S = heSoLuong * 1150000;
		} else if (xepLoai == "C") {
			S = heSoLuong * 1150000 - 400000;
		} else {
			S = heSoLuong * 1150000 - 1000000;
		}
		return S;
	}
}
