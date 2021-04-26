package oop;

public abstract class HocSinh {
	protected String maHS;
	protected String hoTen;
	protected float diemToan;
	protected float diemLy;
	protected float diemHoa;
	
	public HocSinh(String maHS, String hoTen, float diemToan, float diemLy, float diemHoa) {
		this.maHS = maHS;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	
	
	public abstract boolean tinhDiem();
	
	public void inKetQua() {
		String ketQua = tinhDiem() ? "Đậu" : "Rớt";
		System.out.println(String.format("Tên HS: %s - Kết quả: %s", hoTen, ketQua));
	}
	
}
