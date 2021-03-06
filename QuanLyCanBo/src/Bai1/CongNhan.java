package Bai1;

public class CongNhan extends NhanSu {
	private XuongSX xuongSx;
	private String congViec;
	private int soNgayCong;
	private double luong;

	public XuongSX getXuongSx() {
		return xuongSx;
	}

	public void setXuongSx(XuongSX xuongSx) {
		this.xuongSx = xuongSx;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public CongNhan() {
		super();
	}

	public CongNhan(XuongSX xuongSx, String congViec, int soNgayCong, double luong) {
		super();
		this.xuongSx = xuongSx;
		this.congViec = congViec;
		this.soNgayCong = soNgayCong;
		this.luong = luong;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
   public void Nhap()
   {
	   xuongSx = new XuongSX();
	   System.out.printf("=======Nhập thông tin công nhân======");
	   super.Nhap();
	   System.out.printf("\tNhập công việc:");
	   congViec = in.nextLine();
	   System.out.printf("\tNhập số ngày công:");
	   soNgayCong = in.nextInt();
	   System.out.printf("\tNhập lương");
	   luong = in.nextDouble();
	   in.nextLine();
	   System.out.printf("\tNhập tên xuởng :");
	   xuongSx.setTenXuong(in.nextLine());
	   System.out.printf("\tNhập tên quản đốc:");
	   xuongSx.setQuanDoc(in.nextLine());
	   System.out.printf("\tNhập số công nhân:");
	   xuongSx.setSoCongNhan(in.nextInt());
	   System.out.println();
   }

	public void Xuat() {
		System.out.printf("%13s", congViec);
		System.out.printf("%15d", soNgayCong);
		System.out.printf("%13.0f", luong);
		System.out.printf("%13s", xuongSx.getTenXuong());
		System.out.printf("%13s", xuongSx.getQuanDoc());
		System.out.printf("%13d",xuongSx.getSoCongNhan());

	}
	public double TinhLuongCN() {
		double S = 0;
		if (soNgayCong >= 23) {
			S = soNgayCong * 250000 + 500000;
		} else if (soNgayCong >= 20) {
			S = soNgayCong * 250000 + 300000;
		} else if (soNgayCong >= 18) {
			S = soNgayCong * 250000;
		} else {
			S = soNgayCong * 250000 - 200000;
		}
		return S;
	}
}
