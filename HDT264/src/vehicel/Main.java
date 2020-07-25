package vehicel;

public class Main {

	public static void main(String[] args) {
		System.out.println("\nNhap thong tin oto");
		OTO a = new OTO();
		a.Nhap();
		System.out.println("Thong tin oto :");
		a.Xuat();
		System.out.println("\nNhap thong tin moto");
		Moto b = new Moto();
		b.Nhap();
		System.out.println("Thong tin moto :");
		b.Xuat();
	}
}
