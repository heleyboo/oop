package oop;

public class HSLopLy extends HocSinh {
	
	public HSLopLy(String maHS, String hoTen, float diemToan, float diemLy, float diemHoa) {
		super(maHS, hoTen, diemToan, diemLy, diemHoa);
	}

	public boolean tinhDiem() {
		return diemToan + diemLy * 2 + diemHoa > 22;
	}
}
