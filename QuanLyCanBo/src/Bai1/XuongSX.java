package Bai1;
public class XuongSX {
	private String tenXuong;
	private String quanDoc;
	private int soCongNhan;

	public String getTenXuong() {
		return tenXuong;
	}

	public void setTenXuong(String tenXuong) {
		this.tenXuong = tenXuong;
	}

	public String getQuanDoc() {
		return quanDoc;
	}

	public void setQuanDoc(String quanDoc) {
		this.quanDoc = quanDoc;
	}

	public int getSoCongNhan() {
		return soCongNhan;
	}

	public void setSoCongNhan(int soCongNhan) {
		this.soCongNhan = soCongNhan;
	}

	public XuongSX(String tenXuong, String quanDoc, int soCongNhan) {
		super();
		this.tenXuong = tenXuong;
		this.quanDoc = quanDoc;
		this.soCongNhan = soCongNhan;
	}

	public XuongSX() {
		super();
	}

}
