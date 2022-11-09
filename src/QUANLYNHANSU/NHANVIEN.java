package QUANLYNHANSU;

public class NHANVIEN {
	protected String maNhanVien;
	protected String hoTen;
	protected NGAY ngaySinh;
	protected String gioiTinh;
	protected String soDienThoai;
	protected DIACHI diaChi; 
	protected String chucVu;
	protected HOPDONG hopDong;
	protected THANNHAN thanNhan;
	public NHANVIEN() {
		hopDong= new HOPDONG();
		ngaySinh= new NGAY();
		diaChi= new DIACHI();
		thanNhan= new THANNHAN();
	}
	public NHANVIEN(String maNhanVien, String hoTen, NGAY ngaySinh,String gioiTinh, String soDienThoai, DIACHI diaChi,String chucVu, HOPDONG hopDong, THANNHAN thanNhan) {
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh= gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.chucVu=chucVu;
		 this.hopDong=hopDong;
		this.thanNhan=thanNhan;
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public NGAY getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(NGAY ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public DIACHI getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(DIACHI diaChi) {
		this.diaChi = diaChi;
	}
	public HOPDONG getHopDong() {
		return hopDong;
	}
	public void setHopDong(HOPDONG hopDong) {
		this.hopDong = hopDong;
	}
	public THANNHAN getThanNhan() {
		return thanNhan;
	}
	public void setThanNhan(THANNHAN thanNhan) {
		this.thanNhan = thanNhan;
	}
	public void nhapNhanVien() {
		System.out.print("Ma nhan vien -> ");
		this.maNhanVien=test.st.nextLine();
		System.out.print("Ho ten nhan vien -> ");
		this.hoTen=test.st.nextLine();
		System.out.println("Ngay sinh: ");
		this.ngaySinh.nhapNgay();
		System.out.print("Gioi tinh -> ");
		this.gioiTinh=test.st.nextLine();
		System.out.print("So dien thoai -> ");
		this.soDienThoai=test.st.nextLine();
		System.out.println("Dia chi: ");
		this.diaChi.nhapDiaChi();
		System.out.print("Chuc vu -> ");
		this.chucVu=test.st.nextLine();
		System.out.println("Hop dong: ");
		this.hopDong.nhapHopDong();
		System.out.println("Than nhan: ");
		this.thanNhan.nhapNhanThan();
	}
	public void xuatNhanVien() {
		System.out.println("Ma nhan vien: "+this.maNhanVien);
		System.out.println("Ho ten: "+this.hoTen);
		System.out.println("Ngay sinh: "+ngaySinh);
		System.out.println("Gioi tinh: "+ this.gioiTinh);
		System.out.println("So dien thoai: "+ this.soDienThoai);
		System.out.println("Dia chi: "+ diaChi);
		System.out.println("Chuc vu: "+this.chucVu);
		hopDong.xuatHopDong();
		thanNhan.xuatNhanThan();
	}
	public static void main(String[] args) {
		NHANVIEN a= new NHANVIEN();
		a.nhapNhanVien();
		a.xuatNhanVien();
	}
}
