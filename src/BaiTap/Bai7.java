package BaiTap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi vầ diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi vầ diện tích hình tròn");
            System.out.println("3. Tính chu vi và diện tích hình tam giác ");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn là: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap chieu dai: ");
                    double dai = sc.nextDouble();
                    System.out.println("Nhap Chieu rong");
                    double rong = sc.nextDouble();

                    System.out.printf("Hình chữ nhật có chu vi là %.2f%n và diện tích  %.2f%n" ,2*(dai+rong),dai*rong);

                    break;
                case 2:
                    System.out.println("Bán kính của hình tròn là");
                    double bankinh = sc.nextDouble();
                    System.out.printf("Hình tròn có chu vi là %.2f%n và diện tích  %.2f%n" ,2*3.14*bankinh,bankinh*bankinh*3.14);

                    break;
                case 3:
                    System.out.println("Cạnh  thứ nhất của tam giác ");
                    double a = sc.nextDouble();

                    System.out.println("Cạnh  thứ hai của tam giác ");
                    double b = sc.nextDouble();

                    System.out.println("Cạnh  thứ ba của tam giác ");
                    double c = sc.nextDouble();

                    double s = (a + b + c) / 2;
                    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                    System.out.printf("Hình tam giác có chu vi  %.2f%n và diện tích  %.2f%n" ,a+b+c,area);

                    break;
                case 4:
                    System.exit(0);

                    break;
                default:
                    System.out.println("Hãy chọn các lựa chọn từ 1 tới 4");
            }
        }while (true);
    }
}
