package oop;

import java.util.ArrayList;

import java.util.List;

public class HocSinhApp {
	public static void main(String agrs[]) {
		List<HocSinh> danhSachHS = new ArrayList<HocSinh>();
		danhSachHS.add(new HSLopHoa("HS001", "Hỏa Thị Hóa", 7, 4, 6));
		danhSachHS.add(new HSLopToan("HS002", "Trùm Toán", 9, 3, 4));
		danhSachHS.add(new HSLopLy("HS003", "Ngu Thị Lý", 8, 4, 3));
		
		danhSachHS.stream().forEach(hs -> hs.inKetQua());
	}
}
