package QUANLYNHANSU;

public class THUCTAPSINH extends NHANVIEN{
	private double phuCap;
	private String email;
	private String maPhongBan;
	public THUCTAPSINH() {
	}
	public THUCTAPSINH(String maNhanVien, String hoTen, NGAY ngaySinh,String gioiTinh, String soDienThoai, DIACHI diaChi,String chucVu, HOPDONG hopDong, THANNHAN thanNhan,double phuCap, String email, String maPhongBan) {
		super(maNhanVien,hoTen,ngaySinh,gioiTinh,soDienThoai,diaChi,chucVu,hopDong,thanNhan);
		this.phuCap = phuCap;
		this.email = email;
		this.maPhongBan = maPhongBan;
	}
	public void nhapThucTapSinh() {
		super.nhapNhanVien();
		System.out.print("Phu Cap -> ");
		this.phuCap=test.db.nextDouble();
		System.out.print("Email -> ");
		this.email=test.st.nextLine();
		System.out.print("Ma phong ban -> ");
		this.maPhongBan=test.st.nextLine();
	}
	public void bangThucTapSinh() {
		System.out.println("+----------+--------------------+---------------+----------+---------------+-----------------------------------+--------------------------------------------------+---------------+---------------+--------------------+");
		System.out.printf("|%-10s|%-20s|%-15s|%-10s|%-15s|%-35s|%-50s|%-15s|%-15s|%-20s|\n","Ma","Ho Ten","Ngay Sinh","Gioi tinh","So dien Thoai","Email","Dia chi","Chuc vu","Phu cap","Phong ban dang lam");
		System.out.println("+----------+--------------------+---------------+----------+---------------+-----------------------------------+--------------------------------------------------+---------------+---------------+--------------------+");
	}
	public void xuatThucTapSinh() {
		System.out.printf("|%-10s|%-20s|%-15s|%-10s|%-15s|%-35s|%-50s|%-15s|%-15s|%-20s|\n",this.maNhanVien,this.hoTen,this.ngaySinh,this.gioiTinh,this.soDienThoai,this.email,this.diaChi,this.chucVu,this.phuCap,this.maPhongBan);

	}
	public void ketThucBangThucTapSinh() {
		System.out.println("+----------+--------------------+---------------+----------+---------------+-----------------------------------+--------------------------------------------------+---------------+---------------+--------------------+");
	}
	public static void main(String[] args) {
		THUCTAPSINH a = new THUCTAPSINH();
		a.nhapThucTapSinh();
		a.bangThucTapSinh();
		a.xuatThucTapSinh();
		a.ketThucBangThucTapSinh();
	}
	
}
