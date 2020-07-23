package Thu;

public class SinhVien {
	private String Ten;
	private float Diem;
	private XepLoai l;
	
	public SinhVien(String ten, float diem) {
		super();
		Ten = ten;
		Diem = diem;
		l = XepLoai();
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public float getDiem() {
		return Diem;
	}
	public void setDiem(float diem) {
		Diem = diem;
	}
	public XepLoai getL() {
		return l;
	}
	public XepLoai XepLoai()
	{
		if(Diem >=8)
			l = XepLoai.Gioi;
		else if(Diem >= 7)
			l = XepLoai.Kha;
		else if(Diem >= 5)
			l = XepLoai.TrungBinh;
		else 
			l = XepLoai.Yeu;
		return l;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.Ten + "\t " + this.Diem +"\t => "+this.l.Gi();
}
}
