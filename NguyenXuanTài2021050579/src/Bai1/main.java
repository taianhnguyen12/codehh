package Bai1;

public class main {

	public static void main(String[] args) {

		Saler NV1BH = new Saler();
		NV1BH.setName("Nguyễn Xuân Tài ");
		NV1BH.setSalesDoanhSo(3000.0);
		NV1BH.getBonus();
		System.out.println(
				"Name : " + NV1BH.getName() + "DOANH Số : " + NV1BH.getSalesDoanhSo() + "Thưởng : " + NV1BH.getBonus());
		Saler NV2BH = new Saler();
		NV1BH.setName("Hoàng xuân Hoa ");
		NV1BH.setSalesDoanhSo(900000.0);
		NV1BH.getBonus();
		System.out.println(
				"Name : " + NV1BH.getName() + "DOANH Số : " + NV1BH.getSalesDoanhSo() + "Thưởng : " + NV1BH.getBonus());
		Saler NVTT = new Trainee();
		NVTT.setName("Nguyễn HIền");
		NVTT.setSalesDoanhSo(890000.0);
		NVTT.getBonus();
		System.out.println(
				"Name : " + NVTT.getName() + "DOANH Số : " + NVTT.getSalesDoanhSo() + "Thưởng : " + NVTT.getBonus());

	}

}
