package QuanLyBoDoi.src.quanlybodoi;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BoDoi boDoi1 = new BinhSi("001", "Do Xuan Tung", LocalDate.of(2000, 11, 2), "LGBT", "Hung Yen", "0123456789",
                LocalDate.of(2026, 11, 25), "Quan chung", 5);
        boDoi1.getHoTen();
        boDoi1.hienThiThongTin();
    }
}
