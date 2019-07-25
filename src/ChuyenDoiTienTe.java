import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so USD muon chuyen: ");
        int usd = scanner.nextInt();
        int vnd;
        vnd = usd * 23000;
        System.out.println(usd+" USD = "+vnd+ " VND");
    }
}
