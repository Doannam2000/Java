package Bai_03;

import java.util.Scanner;

public class JavaClass 
{
	private Student[] stdList;
	private int ratingStar;
	int n;
	private String leaderName;
	static Scanner sc = new Scanner(System.in);
	private void InputStudent()
	{
		System.out.print("n = ");
		n = sc.nextInt();
		stdList = new Student[n];
		for (int i = 0; i < stdList.length; i++)
		{
			System.out.print("Nhập thông tin sinh viên thứ "+(i+1)+": \n");
			stdList[i] = new Student();
			stdList[i].InputInfo();
		}
	}
	private void ShowStudent()
	{
		for (int i = 0; i < stdList.length; i++)
		{
			stdList[i].ShowInfo();
		}
	}
	public void InputClassInfo()
	{
		System.out.print("Nhập tên Leader: ");
		leaderName = sc.nextLine();
		System.out.print("Đánh giá chất lượng ratingStar cho lớp: ");
		ratingStar = sc.nextInt();
		InputStudent();
	}
	public void ShowClassInfo()
	{
		System.out.println("LeaderName: "+leaderName);
		System.out.println("ratingStar: "+ratingStar);
		ShowStudent();
	}
}
