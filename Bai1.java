
package lab1;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

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
            System.out.println("Phương trình có hai nghiệm thực phân biệt.");
            System.out.println("Nghiệm 1: " + nghiem1);
            System.out.println("Nghiệm 2: " + nghiem2);
        } else if (delta == 0) {

            double nghiemKep = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép.");
            System.out.println("Nghiệm: " + nghiemKep);
        } else {

            double phanThuc = -b / (2 * a);
            double phanAo = Math.sqrt(-delta) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phức.");
            System.out.println("Nghiệm 1: " + phanThuc + " + " + phanAo + "i");
            System.out.println("Nghiệm 2: " + phanThuc + " - " + phanAo + "i");
        }

        scanner.close();
    }
}
