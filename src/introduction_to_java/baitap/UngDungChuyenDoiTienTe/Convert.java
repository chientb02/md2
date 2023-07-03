package introduction_to_java.baitap.UngDungChuyenDoiTienTe;
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền (USD)");
        int USD = scanner.nextInt();
        int VND = USD * 23000 ;
        System.out.println(USD + "USD bằng "+ VND + "VND" );
    }
}
