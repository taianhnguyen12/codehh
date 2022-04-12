import java.util.Scanner;

public class SACH {
	Scanner sc = new Scanner(System.in);
private String TenSach;
private String TenTacGia;
private String NhaXuatBan;
private long MaSach;
private double SoTrang;
private double SoTap;
private float Gia;
public SACH(String tensach,String tentacgia,String nhaxuatban,long ma,double sotrang,double sotap,float gia ) {
	this.TenSach = tensach;
	this.TenTacGia = tentacgia;
	this.NhaXuatBan = nhaxuatban;
	this.MaSach = ma;
	this.SoTrang = sotrang;
	this.SoTap = sotap;
	this.Gia = gia;
	
	
}
public String toString() {
    return "Tên sách: " + this.TenSach + ", tên tác giả: "+ this.TenTacGia +", nhà xuất bản: " + this.NhaXuatBan + ", đơn giá: " + 
            this.Gia + ", số lượng: " + this.SoTap;
}
}