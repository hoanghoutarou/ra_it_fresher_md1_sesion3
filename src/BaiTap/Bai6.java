package BaiTap;

import java.util.Scanner;

public class Bai6 {
    public static boolean check(int x) {
        if (x < 1) {
            return false;
        } else if (x == 2) {
            return true;
        } else if (x > 2) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số mà bạn muốn kiểm tra ");
            int x = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (x%2==0) {
                        System.out.println("Số đã cho là số chẵn");
                    } else {
                        System.out.println("Số đã cho là số lẻ");
                    }
                    break;

                case 2:
                    boolean isPrime = check(x);
                    if (isPrime == true) {
                        System.out.println("Số đã cho là số nguyên tố");
                    } else {
                        System.out.println("Số đã cho không là số nguyên tố");
                    }

                    break;
                case 3:
                    if (x%3==0) {
                        System.out.println("Số đã cho chia hết cho 3");
                    } else {
                        System.out.println("Số đã cho không chia hết cho 3");
                    }

                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Hãy chọn các lựa chọn từ 1 tới 4");

            }
        }while(true);
    }
}
