package QuanLyBoDoi.src.quanlybodoi;

import java.time.LocalDate;

public abstract class BoDoi {
    private String maBoDoi;
    private String hoTen;
    private LocalDate ngaySinh;
    private String gioiTinh;
    private String queQuan;
    private String soDienThoai;
    private LocalDate ngayNhapNgu;

    public BoDoi(String maBoDoi, String hoTen, LocalDate ngaySinh, String gioiTinh, String queQuan, String soDienThoai,
            LocalDate ngayNhapNgu) {
        this.maBoDoi = maBoDoi;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.soDienThoai = soDienThoai;
        this.ngayNhapNgu = ngayNhapNgu;
    }

    public String getMaBoDoi() {
        return maBoDoi;
    }

    public void setMaBoDoi(String maBoDoi) {
        this.maBoDoi = maBoDoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LocalDate getNgayNhapNgu() {
        return ngayNhapNgu;
    }

    public void setNgayNhapNgu(LocalDate ngayNhapNgu) {
        this.ngayNhapNgu = ngayNhapNgu;
    }

    public abstract void thucHienNhiemVu();

    public void hienThiThongTin() {
        System.out.println("Ma bo doi: " + maBoDoi);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Que quan: " + queQuan);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("Ngay nhap ngu: " + ngayNhapNgu);
    }

    public void capNhatThongTin(String hoTen, String queQuan) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
    }

    public void baoCao() {
        System.out.println(hoTen + " dang bao cao cap tren.");
    }
}
