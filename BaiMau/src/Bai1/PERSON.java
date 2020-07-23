package Bai1;

import java.util.Scanner;

public class PERSON {
//	Xây dựng lớp PERSON gồm các thông tin: Họ và tên, Ngày sinh, Quê quán.
	static Scanner input = new Scanner(System.in);
	public String name;
	public String birth;
	public String country;
	public PERSON() 
	{
	}
	public PERSON(String name, String birth, String country) 
	{
		super();
		this.name = name;
		this.birth = birth;
		this.country = country;
	}
	@Override
	public String toString()
	{
		return "PERSON [name=" + name + ", birth=" + birth + ", country=" + country + "]";
	}
	public void Nhap()
	{
		System.out.println("Nhập tên :");
		name = input.nextLine();
		input.nextLine();
		System.out.println("Nhập tuổi :");
		birth = input.nextLine();
		input.nextLine();
		System.out.println("Nhập quốc gia :");
		country = input.nextLine();
		input.nextLine();
	}
}
