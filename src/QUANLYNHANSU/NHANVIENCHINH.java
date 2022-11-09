package QUANLYNHANSU;

public class NHANVIENCHINH extends NHANVIEN {
	private LUONG luong;
	private String email;
	private String maPhongBan;
	private int soDuAnDaThucHien;
	private  String maDuAnDangLam;
	public NHANVIENCHINH() {
		luong= new LUONG();
	}
	public NHANVIENCHINH(String maNhanVien, String hoTen, NGAY ngaySinh,String gioiTinh, String soDienThoai, DIACHI diaChi,String chucVu, HOPDONG hopDong, THANNHAN thanNhan,LUONG luong, String email, String maPhongBan, int soDuAnDaThucHien, String maDuAnDangLam) {
		super(maNhanVien,hoTen,ngaySinh,gioiTinh,soDienThoai,diaChi,chucVu,hopDong,thanNhan);
		this.luong = luong;
		this.email = email;
		this.maPhongBan = maPhongBan;
		this.soDuAnDaThucHien = soDuAnDaThucHien;
		this.maDuAnDangLam = maDuAnDangLam;
	}
	public LUONG getLuong() {
		return luong;
	}
	public void setLuong(LUONG luong) {
		this.luong = luong;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMaPhongBan() {
		return maPhongBan;
	}
	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}
	public int getSoDuAnDaThucHien() {
		return soDuAnDaThucHien;
	}
	public void setSoDuAnDaThucHien(int soDuAnDaThucHien) {
		this.soDuAnDaThucHien = soDuAnDaThucHien;
	}
	public String getMaDuAnDangLam() {
		return maDuAnDangLam;
	}
	public void setMaDuAnDangLam(String maDuAnDangLam) {
		this.maDuAnDangLam = maDuAnDangLam;
	}
	public void nhapNhanVienChinh() {
		super.nhapNhanVien();
		System.out.println("Luong:");
		luong.nhapLuong();
		System.out.print("Email -> ");
		this.email=test.st.nextLine();
		System.out.print("Ma phong ban -> ");
		this.email=test.st.nextLine();
		System.out.print("So du an da thuc hien -> ");
		this.soDuAnDaThucHien=Integer.parseInt(test.in.nextLine());
		System.out.print("Ma du an dang lam -> ");
		this.maDuAnDangLam=test.st.nextLine();
	}
	public void bangNhanVienChinh() {
		System.out.println("+----------+--------------------+---------------+----------+---------------+-----------------------------------+--------------------------------------------------+---------------+---------------+--------------------+--------------------+");
		System.out.printf("|%-10s|%-20s|%-15s|%-10s|%-15s|%-35s|%-50s|%-15s|%-15s|%-20s|%-20s|\n","Ma","Ho Ten","Ngay Sinh","Gioi tinh","So dien Thoai","Email","Dia chi","Chuc vu","Luong Chinh","Du an da thuc hien","Du an dang lam");
		System.out.println("+----------+--------------------+---------------+----------+---------------+-----------------------------------+--------------------------------------------------+---------------+---------------+--------------------+--------------------+");
	}
	public void xuatNhanVienChinh() {
		System.out.printf("|%-10s|%-20s|%-15s|%-10s|%-15s|%-35s|%-50s|%-15s|%-15s|%-20s|%-20s|\n",this.maNhanVien,this.hoTen,this.ngaySinh,this.gioiTinh,this.soDienThoai,this.email,this.diaChi,this.chucVu,luong.getLuong(),this.soDuAnDaThucHien,this.maDuAnDangLam);

	}
	public void ketThucBangNhanVienChinh() {
		System.out.println("+----------+--------------------+---------------+----------+---------------+-----------------------------------+--------------------------------------------------+---------------+---------------+--------------------+--------------------+");
	}
	public static void main(String[] args) {
		NHANVIENCHINH a= new NHANVIENCHINH();
		a.nhapNhanVienChinh();
		a.bangNhanVienChinh();
		a.xuatNhanVienChinh();
		a.ketThucBangNhanVienChinh();
	}

}


