package oop;

public class HSLopHoa extends HocSinh {
	
	public HSLopHoa(String maHS, String hoTen, float diemToan, float diemLy, float diemHoa) {
		super(maHS, hoTen, diemToan, diemLy, diemHoa);
	}

	public boolean tinhDiem() {
		return diemToan + diemLy + diemHoa * 2 > 22;
	}
}
