package lab1.bin;

import java.util.Scanner;

public class Bai3 {

    // Hàm giải phương trình bậc hai từ Bài 1
    public static void giaiPhuongTrinhBacHai() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double nghiem1 = (-b + Math.sqrt(delta)) / (2 * a);
            double nghiem2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm thực phân biệt:");
            System.out.println("Nghiệm 1: " + nghiem1);
            System.out.println("Nghiệm 2: " + nghiem2);
        } else if (delta == 0) {
            double nghiemKep = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: " + nghiemKep);
        } else {
            double phanThuc = -b / (2 * a);
            double phanAo = Math.sqrt(-delta) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phức:");
            System.out.println("Nghiệm 1: " + phanThuc + " + " + phanAo + "i");
            System.out.println("Nghiệm 2: " + phanThuc + " - " + phanAo + "i");
        }
    }

    // Hàm tính tiền điện từ Bài 2
    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập lượng điện sử dụng trong tháng (kWh): ");
        int soDien = scanner.nextInt();

        int tienDien;

        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("Tiền điện phải trả là: " + tienDien + " VND");
    }

    // Hàm main tổ chức menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Giải phương trình bậc hai");
            System.out.println("2. Tính tiền điện");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPhuongTrinhBacHai(); // Gọi hàm giải phương trình bậc hai
                    break;
                case 2:
                    tinhTienDien(); // Gọi hàm tính tiền điện
                    break;
                case 3:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
