package Bài3;

public class Test {
	public static void main(String[] args) {
		nhanvien1 s = new nhanvien1("Nguyễn Xuân Tài", 10, 15000);
		nhanvien n = new nhanvien("Nguyễn Gia Huy", 0, 0);

		System.out.println("nhân viên có doanh số : " + s.getDanhso());
		System.out.println("nhân viên có doanh số : " + s.getName());
		System.out.println("nhân viên có doanh số : " + s.getTienthuong());

		System.out.println("nhân viên không có doanh số : " + n.getDanhso());
		System.out.println("nhân viên không có doanh số : " + n.getName());
		System.out.println("nhân viên không có doanh số : " + n.getTienthuong());

	}
}
