import java.util.Scanner;

public class HinhTron extends Diem {
	private int r;

	HinhTron() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập bán kính r: ");
		this.r = sc.nextInt();

	}

	HinhTron(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public void InHinhTron() {
		System.out.println("Tọa độ của hình tròn là : ");
		super.InDiem();
		System.out.println("bán kính của hình tròn: " + r);

	}
	public float chuvi() {
		return  ( float ) Math.PI*r*2;	
	}
	public float DienTich() {
		return (float) Math.PI*r*r;
	}

	public static void main(String[] args) {
		System.out.println("nhập tọa độ đỉnh và bán kính hình tròn: ");
		HinhTron o = new HinhTron();
		o.InHinhTron();
System.out.println("Chu vi " + o.chuvi());
		System.out.println("hình tròn thứ 2:");
		HinhTron o2 = new HinhTron(0, 5, 0);
		o2.InHinhTron();
	}

}
