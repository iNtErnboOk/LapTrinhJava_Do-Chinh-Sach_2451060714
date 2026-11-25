package QuanLyBoDoi.src.quanlybodoi;

import java.time.LocalDate;

public class BinhSi extends BoDoi {
    private String loaiQuanNhan;
    private int thoiHanPhucVu;

    public BinhSi(String ma, String ten, LocalDate ngaySinh, String gioiTinh, String queQuan, String sdt,
            LocalDate ngayNhapNgu,
            String loaiQuanNhan, int thoiHan) {
        super(ma, ten, ngaySinh, gioiTinh, queQuan, sdt, ngayNhapNgu);
        this.loaiQuanNhan = loaiQuanNhan;
        this.thoiHanPhucVu = thoiHan;
    }

    public String getLoaiQuanNhan() {
        return loaiQuanNhan;
    }

    public void setLoaiQuanNhan(String loaiQuanNhan) {
        this.loaiQuanNhan = loaiQuanNhan;
    }

    public int getThoiHanPhucVu() {
        return thoiHanPhucVu;
    }

    public void setThoiHanPhucVu(int thoiHanPhucVu) {
        this.thoiHanPhucVu = thoiHanPhucVu;
    }

    public void renLuyen() {
        System.out.println(getHoTen() + " dang ren luyen.");
    }

    public void thamGiaHuanLuyen() {
        System.out.println(getHoTen() + " dang tham gia huan luyen.");
    }

    public void baoCaoCapTren() {
        System.out.println(getHoTen() + " dang bao cao cap tren.");
    }

    @Override
    public void thucHienNhiemVu() {
        System.out.println("Binh si thuc hien nhiem vu duoc giao.");
    }
}
