package lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện sử dụng từ bàn phím
        System.out.print("Nhập lượng điện sử dụng trong tháng (kWh): ");
        int soDien = scanner.nextInt();

        // Biến để lưu số tiền điện
        int tienDien;

        // Tính tiền điện theo phương pháp lũy tiến
        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }

        // Hiển thị tiền điện
        System.out.println("Tiền điện phải trả là: " + tienDien + " VND");

        scanner.close();
    }
}
