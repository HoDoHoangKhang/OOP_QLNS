package QUANLYNHANSU;

public class NGAY {
	private int ngay;
	private int thang;
	private int nam;
	public NGAY() {
	}
	public NGAY(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam(){
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public void nhapNgay() {
		System.out.print("\tNgay -> ");
		this.ngay=Integer.parseInt(test.in.nextLine());
		System.out.print("\tThang -> ");
		this.thang=Integer.parseInt(test.in.nextLine());
		System.out.print("\tNam -> ");
		this.nam=Integer.parseInt(test.in.nextLine());
	}
	@Override
	public String toString() {
		return this.ngay+"/"+this.thang+"/"+this.nam;
	}
//	public static void main(String[] agrs) {
//		NGAY a = new NGAY();
//		a.nhapNgay();
//		System.out.println(a);
//	}
	
	
}
