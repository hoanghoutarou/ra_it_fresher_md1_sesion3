import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        while (a != 0) {
            System.out.println("Nhap vao mot so :");
            a = Integer.parseInt(sc.nextLine());
            sum += a;
        }
        System.out.println("Tổng:"+sum);

    }
}
