package QuanLyBoDoi.src.quanlybodoi;

import java.time.LocalDate;

public class SiQuan extends BoDoi {
    private String trinhDoChuyenMon;
    private String chuyenNganh;
    private int namPhongHam;

    public SiQuan(String ma, String ten, LocalDate ngaySinh, String gioiTinh, String queQuan, String sdt,
            LocalDate ngayNhapNgu, String trinhDo, String chuyenNganh, int namPhongHam) {
        super(ma, ten, ngaySinh, gioiTinh, queQuan, sdt, ngayNhapNgu);
        this.trinhDoChuyenMon = trinhDo;
        this.chuyenNganh = chuyenNganh;
        this.namPhongHam = namPhongHam;
    }

    public String getTrinhDoChuyenMon() {
        return trinhDoChuyenMon;
    }

    public void setTrinhDoChuyenMon(String trinhDoChuyenMon) {
        this.trinhDoChuyenMon = trinhDoChuyenMon;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamPhongHam() {
        return namPhongHam;
    }

    public void setNamPhongHam(int namPhongHam) {
        this.namPhongHam = namPhongHam;
    }

    public void chiHuy() {
        System.out.println(getHoTen() + " dang chi huy.");
    }

    public void lapKeHoach() {
        System.out.println(getHoTen() + " dang lap ke hoach.");
    }

    public void phanCongNhiemVu() {
        System.out.println(getHoTen() + " dang phan cong nhiem vu.");
    }

    @Override
    public void thucHienNhiemVu() {
        System.out.println("Si quan thuc hien cong tac chi huy.");
    }
}
