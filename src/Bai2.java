import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        while (a != 0) {
            System.out.println("Nhap vao mot so :");
            a = Integer.parseInt(sc.nextLine());
            if (a%2!=0){
                sum += a;
            }
        }
        System.out.println("Tong cac so vua nhap:" + sum);
    }
}
