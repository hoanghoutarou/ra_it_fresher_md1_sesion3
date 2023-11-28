import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int a = sc.nextInt();
        System.out.println("Nhập số thứ hai");
        int b = sc.nextInt();
        System.out.println("Nhập số thứ ba");
        int c = sc.nextInt();
        do {
            System.out.println("Menu:");
            System.out.println("1. Tổng của ba số nguyên");
            System.out.println("2. Trung bình cộng của ba số nguyên");
            System.out.println("3. Số lớn nhất, nhỏ nhất");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn là: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.printf("Tong: %d \n",a+b+c);
                    break;
                case 2:
                    System.out.printf("trung binh cong: %3f \n",(a+b+c)/3);
                    break;
                case 3:
                    int min = a;
                    int max = a;
                    if(min>b){
                        min=b;
                        if(min>c){
                            min=c;
                        }
                    }
                    if(max<b){
                        max=b;
                        if(max<c){
                            max=c;
                        }
                    }

                    System.out.printf("So nho nhat la %d va so lon nhat la %d \n",min,max);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hay nhap so trong khoang tu 1-4");
            }
        }while (true);
    }
}
