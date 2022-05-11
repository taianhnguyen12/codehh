package Bài3;

public class nhanvien2 extends nhanvien {

	public nhanvien2(String name, double danhso, double tienthuong) {
		super(name, danhso, tienthuong);

	}

	public void tennhanvien() {
		System.out.println("Nguyễn Xuân Tài");
	}

	public double doanhsobanhang(double x) {
		return this.getDanhso();
	}

	public double tienthuong(double x) {
		return this.getTienthuong();
	}
}
