package Bài3;

public class nhanvien {
	private String name;
	private double danhso;
	private double tienthuong;

	public nhanvien(String name, double danhso, double tienthuong) {
		super();
		this.name = name;
		this.danhso = danhso;
		this.tienthuong = tienthuong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDanhso() {
		return danhso;
	}

	public void setDanhso(double danhso) {
		this.danhso = danhso;
	}

	public double getTienthuong() {
		return tienthuong;
	}

	public void setTienthuong(double tienthuong) {
		this.tienthuong = tienthuong;
	}

}
