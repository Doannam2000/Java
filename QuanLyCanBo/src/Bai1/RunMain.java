package Bai1;

import java.util.Scanner;

public class RunMain {

	 static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		    int n;
		int inputNhap;
		 System.out.printf("\tNhập số nhân sự:");
			n = in.nextInt();
			CanBo[] cb = new CanBo[10];
	CongNhan[] cn = new CongNhan[10];
		System.out.printf("\tNhập 1 để nhập cán bộ, công nhân:");
		inputNhap = in.nextInt();
		switch (inputNhap) {
		case 1:
			for (int i = 0; i < n; i++) {
				System.out.println("Nhập nhân sự thứ:" + (i + 1));
				ns[i] = new NhanSu();
				cb[i] = new CanBo();
				cn[i] = new CongNhan();
				ns[i].Nhap();
				cb[i].Nhap();
				cn[i].Nhap();
			}
			break;

		default:
			System.out.println("\t\t===========Yêu Cầu Bạn Chọn 1 hoặc 2============");
			break;
		}

		System.out.println("\t\t----------------MENU-------------------");
		System.out.println("\t0:Thoát chương trình!");
		System.out.println("\t1:Hiển thị danh sách nhân sự. ");
		System.out.println("\t2:Hiển thị danh sách công nhân nam. ");
		System.out.println("\t3:Hiển thị danh sách cán bộ nữ.");
		System.out.println("\t4:Hiển thị danh sách cán bộ có lương cao nhất. ");
		System.out.println("\t5:Hiển thị danh sách công nhân có lương thấp nhất.");
		System.out.println("\t6:Tínhtổng salary của tất cả các cán bộ và hiển thị kết quả. ");
		System.out.println("\t7:Tínhtổng lương của tất cả công nhân, hiển thị kết quả.");
		System.out.println("\t8:Chuyển các công nhân xuống cuối danh sách, hiển thị danh sách. ");
		System.out.println("\t9: Sắp xếp danh sách nhân sự theo chiều tăng dần của tên.\n" + "");
		int BaiTap;
		do {
			System.out.println();
			System.out.println("Bạn chọn gì?");
			BaiTap = in.nextInt();

			switch (BaiTap) {
			case 1:
				System.out.println(" ");
				System.out.println("\t\t------------DANH SÁCH CÁN BỘ-------------");
				title();
				titlecb();
				System.out.println(" ");
				for (int i = 0; i < ns.length; i++) {
					ns[i].Xuat();
					cb[i].Xuat();
					System.out.println(" ");
				}

				System.out.println();
				System.out.println("\t\t------------DANH SÁCH CÔNG NHÂN-------------");
				title();
				titlecn();
				System.out.println();
				for (int i = 0; i < ns.length; i++) {
					ns[i].Xuat();
					cn[i].Xuat();
					System.out.println(" ");
				}
				break;
			case 2:
				System.out.println(" ");
				System.out.println("-----------DANH SÁCH CÔNG NHÂN NAM---------");
				title();
				titlecn();
				for(int i=0;i<cn.length; i++)
				{
					if(cn[i].getGioiTinh().compareToIgnoreCase("Nam")==0 )
					{
						cn[i].Xuat();
						System.out.println();
					}
					
					else
						System.out.println("======KHÔNG CÓ======");
				}
				break;
			case 3:
				function3();
				break;
			case 4:
				function4();
				break;
			case 5:
				function5();
				break;
			case 6:
				function6();
				break;
			case 7:
				function7();
				break;
			case 8:
				function8();
				break;
			case 9:
				function9();
				break;
			case 0:
				System.out.println("Chương trình đã thoát");
				return;
			}
		} while (true);

	}

	public static void title() {
		System.out.printf("%4s", "STT");
		System.out.printf("%10s", "Mã NS");
		System.out.printf("%12s", "Họ Đệm");
		System.out.printf("%10s", "Tên");
		System.out.printf("%10s", "Năm Sinh");
		System.out.printf("%10s", "Giới Tính");
	}

	public static void titlecb() {
		System.out.printf("%10s", "Chức Vụ");
		System.out.printf("%15s", "Hệ Số Lương");
		System.out.printf("%11s", "Xếp Loại");
		System.out.printf("%10s", "Lương");
		System.out.printf("%11s", "Tên Phòng");
		System.out.printf("%11s", "Trưởng Phòng");
	}

	public static void titlecn() {
		System.out.printf("%10s", "Công Việc");
		System.out.printf("%15s", "Số Ngày Công");
		System.out.printf("%10s", "Lương");
		System.out.printf("%10s", "Tên Xưởng");
		System.out.printf("%10s", "Quản Đốc");
		System.out.printf("%15s", "Số Công Nhân");
	}

	public static void function1() {
		
	}

	public static void function2() {

	}

	public static void function3() {

	}

	public static void function4() {

	}

	public static void function5() {

	}

	public static void function6() {

	}

	public static void function7() {

	}

	public static void function8() {

	}

	public static void function9() {

	}

}
