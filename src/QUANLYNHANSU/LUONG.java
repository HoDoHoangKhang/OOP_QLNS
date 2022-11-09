package QUANLYNHANSU;

public class LUONG {
	private double luongCoBan;
	private double heSoLuong;
	private double luong;
	public LUONG() {
	}
	public LUONG(double luongCoBan,double heSoLuong,double luong) {
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.luong = luong;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public void nhapLuong() {
		System.out.print("Luong co ban (Don vi: Trieu Dong) -> ");
		this.luongCoBan=test.db.nextDouble();
		System.out.print("He so luong -> ");
		this.heSoLuong=test.db.nextDouble();
		this.luong=luongCoBan*heSoLuong;
	}
	public void xuatLuong() {
		System.out.println("Luong co ban : "+this.luongCoBan +" trieu dong");
		System.out.println("He so luong: "+this.heSoLuong);
		System.out.println("Luong: "+this.luong +" trieu dong");
	}
	@Override
	public String toString() {
		return "LUONG [luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong + ", luong=" + luong + "]";
	}
//	public static void main(String[] args) {
//		LUONG a= new LUONG();
//		a.nhapLuong();
//		a.xuatLuong();
//	}
}
