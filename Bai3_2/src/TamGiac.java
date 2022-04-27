
public class TamGiac {
private Diem A,B,C;
TamGiac()
{
	this.A = A;
	this.B = B;
	this.C = C;
	
}
public void InTamGiac() {
	System.out.println("Tọa độ 3 đỉnh là : ");
	System.out.println("A" );
	A.InDiem();
	B.InDiem();
	C.InDiem();
	
}
public static void main(String[] args) {
	System.out.println("Nhập 3 đỉnh của tam giác: ");
	TamGiac ABC = new TamGiac();
	ABC.InTamGiac();
}
}
