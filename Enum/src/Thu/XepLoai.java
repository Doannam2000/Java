package Thu;

public enum XepLoai {
	Gioi ("Giỏi"),
	Kha("Khá"),
	TrungBinh("Trung Bình"),
	Yeu("Yếu");
	private String bien;
	XepLoai(String bien)
	{
		this.bien = bien;
	}
	public String Gi()
	{
		return this.bien;
	}
}
