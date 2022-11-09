package QUANLYNHANSU;

public class DIACHI {
	private String soNha;
	private String tenDuong;
	private	String tenPhuong;
	private String tenQuan;
	private String tenThanhPho;
	public DIACHI() {}
	public DIACHI(String soNha, String tenDuong, String tenPhuong, String tenQuan, String tenThanhPho) {
		this.soNha = soNha;
		this.tenDuong = tenDuong;
		this.tenPhuong = tenPhuong;
		this.tenQuan = tenQuan;
		this.tenThanhPho = tenThanhPho;
	}
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public String getTenDuong() {
		return tenDuong;
	}
	public void setTenDuong(String tenDuong) {
		this.tenDuong = tenDuong;
	}
	public String getTenPhuong() {
		return tenPhuong;
	}
	public void setTenPhuong(String tenPhuong) {
		this.tenPhuong = tenPhuong;
	}
	public String getTenQuan() {
		return tenQuan;
	}
	public void setTenQuan(String tenQuan) {
		this.tenQuan = tenQuan;
	}
	public String getTenThanhPho() {
		return tenThanhPho;
	}
	public void setTenThanhPho(String tenThanhPho) {
		this.tenThanhPho = tenThanhPho;
	}	
	
	public void nhapDiaChi() {
		System.out.print("\tSo nha -> ");
		this.soNha=test.st.nextLine();
		System.out.print("\tTen duong -> ");
		this.tenDuong=test.st.nextLine();
		System.out.print("\tTen phuong -> ");
		this.tenPhuong=test.st.nextLine();
		System.out.print("\tTen quan -> ");
		this.tenQuan=test.st.nextLine();
		System.out.print("\tTen thanh pho -> ");
		this.tenThanhPho=test.st.nextLine();
	}
	@Override
	public String toString () {
		return this.soNha+", "+this.tenDuong+", "+this.tenPhuong+", "+this.tenQuan+", "+this.tenThanhPho;
	}

//	public static void main(String[] args) {
//		DIACHI a= new DIACHI();
//		a.nhapDiaChi();
//		System.out.println(a);
//	}
}
