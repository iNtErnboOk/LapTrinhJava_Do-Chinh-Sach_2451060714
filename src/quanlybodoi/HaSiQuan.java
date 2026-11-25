package QuanLyBoDoi.src.quanlybodoi;

import java.time.LocalDate;

public class HaSiQuan extends BoDoi {

    private String chuyenMonQuanSu;
    private int thoiGianPhucVu;

    public HaSiQuan(String ma, String ten, LocalDate ngaySinh,
            String gioiTinh, String queQuan,
            String sdt, LocalDate ngayNhapNgu,
            String chuyenMon, int thoiGian) {
        super(ma, ten, ngaySinh, gioiTinh,
                queQuan, sdt, ngayNhapNgu);
        this.chuyenMonQuanSu = chuyenMon;
        this.thoiGianPhucVu = thoiGian;
    }

    public String getChuyenMonQuanSu() {
        return chuyenMonQuanSu;
    }

    public void setChuyenMonQuanSu(String chuyenMon) {
        this.chuyenMonQuanSu = chuyenMon;
    }

    public int getThoiGianPhucVu() {
        return thoiGianPhucVu;
    }

    public void setThoiGianPhucVu(int thoiGian) {
        this.thoiGianPhucVu = thoiGian;
    }

    public void hoTroChiHuy() {
        System.out.println(getHoTen() + " dang ho tro chi huy.");
    }

    public void huongDanBinhSi() {
        System.out.println(getHoTen() + " dang huong dan binh si.");
    }

    @Override
    public void thucHienNhiemVu() {
        System.out.println("Ha si quan thuc hien nhiem vu ho tro.");
    }
}