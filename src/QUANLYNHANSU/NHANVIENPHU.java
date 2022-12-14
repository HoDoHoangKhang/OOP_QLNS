package QUANLYNHANSU;

public class NHANVIENPHU extends NHANVIEN {
	private LUONG luong;

	public NHANVIENPHU() {
		luong= new LUONG();
	}
	public NHANVIENPHU(String maNhanVien, String hoTen, NGAY ngaySinh,String gioiTinh, String soDienThoai, DIACHI diaChi,String chucVu, HOPDONG hopDong, THANNHAN thanNhan,LUONG luong) {
		super(maNhanVien,hoTen,ngaySinh,gioiTinh,soDienThoai,diaChi,chucVu,hopDong,thanNhan);
		this.luong = luong;
	}
	public LUONG getLuong() {
		return luong;
	}
	public void setLuong(LUONG luong) {
		this.luong = luong;
	}
	public void nhapNhanVienPhu() {
		super.nhapNhanVien();
		System.out.println("Luong:");
		this.luong.nhapLuong();
	}
	public void bangNhanVienPhu() {
		System.out.println("+----------+--------------------+---------------+----------+---------------+--------------------------------------------------+---------------+---------------+");
		System.out.printf("|%-10s|%-20s|%-15s|%-10s|%-15s|%-50s|%-15s|%-15s|\n","Ma","Ho Ten","Ngay Sinh","Gioi tinh","So dien Thoai","Dia chi","Chuc vu","Luong");
		System.out.println("+----------+--------------------+---------------+----------+---------------+--------------------------------------------------+---------------+---------------+");
	}
	public void xuatNhanVienPhu() {
		System.out.printf("|%-10s|%-20s|%-15s|%-10s|%-15s|%-50s|%-15s|%-15s|\n",this.maNhanVien,this.hoTen,this.ngaySinh,this.gioiTinh,this.soDienThoai,this.diaChi,this.chucVu,luong.getLuong());

	}
	public void ketThucBangNhanVienPhu() {
		System.out.println("+----------+--------------------+---------------+----------+---------------+--------------------------------------------------+---------------+---------------+");
	}
	public static void main(String[] args) {
		NHANVIENPHU a = new NHANVIENPHU();
		a.nhapNhanVienPhu();
		a.bangNhanVienPhu();
		a.xuatNhanVienPhu();
		a.ketThucBangNhanVienPhu();
	}

}
