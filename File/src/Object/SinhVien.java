package Object;

import java.io.Serializable;

public class SinhVien implements Serializable{
	private String ten;
	private float Diem;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getDiem() {
		return Diem;
	}
	public void setDiem(float diem) {
		Diem = diem;
	}
	public SinhVien(String ten, float diem) {
		super();
		this.ten = ten;
		Diem = diem;
	}
	
}
