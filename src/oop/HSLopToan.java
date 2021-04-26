package oop;

public class HSLopToan extends HocSinh {
	
	public HSLopToan(String maHS, String hoTen, float diemToan, float diemLy, float diemHoa) {
		super(maHS, hoTen, diemToan, diemLy, diemHoa);
	}

	public boolean tinhDiem() {
		return diemToan * 2 + diemLy + diemHoa > 22;
	}
}
