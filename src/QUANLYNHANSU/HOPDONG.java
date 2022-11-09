package QUANLYNHANSU;

public class HOPDONG {
	private NGAY ngayBatDauHopDong;
	private NGAY ngayKetThucHopDong;
	public HOPDONG(NGAY ngayBatDauHopDong, NGAY ngayKetThucHopDong) {
		this.ngayBatDauHopDong = ngayBatDauHopDong;
		this.ngayKetThucHopDong = ngayKetThucHopDong;
	}
	public HOPDONG() {
		ngayBatDauHopDong = new NGAY();
		ngayKetThucHopDong= new NGAY();
	}
	public NGAY getNgayBatDauHopDong() {
		return ngayBatDauHopDong;
	}
	public void setNgayBatDauHopDong(NGAY ngayBatDauHopDong) {
		this.ngayBatDauHopDong = ngayBatDauHopDong;
	}
	public NGAY getNgayKetThucHopDong() {
		return ngayKetThucHopDong;
	}
	public void setNgayKetThucHopDong(NGAY ngayKetThucHopDong) {
		this.ngayKetThucHopDong = ngayKetThucHopDong;
	}

	public void nhapHopDong() {
		System.out.println("Ngay bat dau hop dong: ");
		this.ngayBatDauHopDong.nhapNgay();
		System.out.println("Ngay ket thuc hop dong: ");
		this.ngayKetThucHopDong.nhapNgay();
	}
	public void xuatHopDong() {
		System.out.println("Ngay bat dau hop dong: "+ngayBatDauHopDong);
		System.out.println("Ngay ket thuc hop dong: "+ngayKetThucHopDong);
	}
	@Override
	public String toString() {
		return "HOPDONG [ngayBatDauHopDong=" + ngayBatDauHopDong + ", ngayKetThucHopDong=" + ngayKetThucHopDong + "]";
	}
//	public static void main(String[] args) {
//		HOPDONG a= new HOPDONG();
//		a.nhapHopDong();
//		a.xuatHopDong();
//	}
}
