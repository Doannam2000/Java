package Bai2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class Main {
	static Scanner cin = new Scanner(System.in);

	public static void HienThi() {
		System.out.printf("%15s", "mã nv");
		System.out.printf("%15s", "họ đệm");
		System.out.printf("%15s", "tên");
		System.out.printf("%15s", "ngày sinh");
		System.out.printf("%15s", "mã phòng");
		System.out.printf("%15s", "tên phòng");
		System.out.printf("%15s", "tên trgp");
		System.out.printf("%15s", "số nv");
		System.out.println(" ");
	}

	public static void PhongTaiChinh(ArrayList<NhanVien> map, int n) {
		System.out.println("\t\t\t\t\t------------Phòng Tài Chính------------ ");
		HienThi();
		for (NhanVien x : map) {
			if (x.phong.getTenPb().compareToIgnoreCase("Tài Chính") == 0) {
				x.Xuat();
			}
		}
	}

	public static void SapXep(ArrayList<NhanVien> map, int n) {
		System.out.println("\t\t\t\t-------------Thông tin nhân viên sau khi sắp xếp--------------");
		HienThi();
		Collections.sort(map, new Comparator<NhanVien>() {
			@Override
			public int compare(NhanVien arg0, NhanVien arg1) {
				int m = arg0.getTen().compareToIgnoreCase(arg1.getTen());
				if (m == 0)
					return 0;
				else if (m > 0)
					return 1;
				else
					return -1;
			}
		});
		for (NhanVien x : map) {
			x.Xuat();
		}

	}

	public static void Chen(ArrayList<NhanVien> map, int n) {
		int vt;
		System.out.printf("Nhập vị trí cần chèn :");
		vt = cin.nextInt();
		System.out.println("Nhập thông tin cần chèn ");
		NhanVien b = new NhanVien();
		b.Nhap();
		map.add(vt, b);
		System.out.println("\t\t\t\t-------------Thông tin nhân viên sau khi chèn --------------");
		HienThi();
		for (NhanVien x : map) {
			x.Xuat();
		}
	}

	public static void Xoa(ArrayList<NhanVien> map, int n) {
		for (int i=0 ;i<map.size();i++) {
			if (map.get(i).getMaNv() == 123)
				map.remove(i);
		}
		System.out.println("\t\t\t\t-------------Thông tin nhân viên sau khi xóa --------------");
		HienThi();
		for (NhanVien x : map) {
			x.Xuat();
		}
	}

	public static void main(String[] args) {

		ArrayList<NhanVien> map = new ArrayList<>();
		int n;
		System.out.println("Nhập số lượng nhân viên :");
		n = cin.nextInt();
		System.out.println("Nhập thông tin nhân viên");
		for (int i = 0; i < n; i++) {
			NhanVien x = new NhanVien();
			System.out.println("Nhập thông tin nhân viên " + (i + 1));
			x.Nhap();
			map.add(x);
		}
		System.out.println("\t\t\t\t\t-------------Thông tin nhân viên --------------");
		HienThi();
		for (NhanVien x : map) {
			x.Xuat();
		}
		PhongTaiChinh(map, n);
		SapXep(map, n);
		Chen(map, n);
		Xoa(map, n);
	}
}