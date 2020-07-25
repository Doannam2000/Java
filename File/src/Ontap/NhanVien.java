package Ontap;

import java.io.Serializable;
import java.util.Date;

public class NhanVien implements Serializable{
	private String ma;
	private String ten;
	private Date ngaySinh;
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
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public NhanVien(String ma, String ten, Date i) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.ngaySinh = i;
	}
	public NhanVien() {
		super();
	}
	@Override
	public String toString() {
		return ma+"\t"+ten + "\t" + FormatDate.FormatToString(ngaySinh);
	}
}
