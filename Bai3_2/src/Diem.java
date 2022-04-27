import java.util.Scanner;

public class Diem {
	private int x, y;

	Diem(int x, int y) {
	}

	{
		this.x = x;
		this.y = y;
	}

	Diem() {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();

	}

	public void InDiem() {
		System.out.println(" Diem vừa nhập : ( " + this.x + "," + this.y + ")");

	}

	public static void main(String[] args) {
		Diem A = new Diem();
		A.InDiem();
	}
}
