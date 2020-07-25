package OnTap2;

import java.io.Serializable;
import java.util.Date;

public class NhanVien implements Serializable{
	private String ma;
	private String ten;
	private int Luong;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	public NhanVien(String ma, String ten, int luong) {
		super();
		this.ma = ma;
		this.ten = ten;
		Luong = luong;
	}
	public NhanVien() {
		super();
	}
	@Override
	public String toString() 
	{
		return this.ma+"\t"+this.ten+"\t"+this.Luong;
	}
}
