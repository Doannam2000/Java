package bai2;


public class TamGiac {
	public static void nhap(double a, double b, double h)
	{
		if(a+b<=h || a+h<=b || b+h<=a)
		System.out.print("day khong phai tam giac");
	}
	public static double ChuVi(double a, double b, double h)
	{
		return a+b+h;
	}
	public static double DienTich(double a, double b, double h)
	{		
		return Math.sqrt((a+b+h)/2*((a+b+h)/2-a)*((a+b+h)-b)*((a+b+h)-h));
	}
	public static void main(String[] args) {
		double a=4.4,b=5.5,h=4;
		double P=ChuVi(a,b,h);
		double S=DienTich(a,b,h);
		System.out.println("chu vi ="+P);
		System.out.println("dien tich="+S);
	}

}
