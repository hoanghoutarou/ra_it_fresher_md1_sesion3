import java.util.Scanner;

public class Bai6 {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int x = sc.nextInt();
        System.out.println("Nhập số thứ hai");
        int y= sc.nextInt();
        int ucln = 0,bcnn;
        do{

            System.out.println("Menu:");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn là: ");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.printf("Tổng: %d \n",(x+y));
                    break;
                case 2:
                    if (x > y) {
                        System.out.printf("Hiệu: %d \n", x - y);
                    } else {
                        System.out.printf("Hiệu: %d \n", y - x);
                    }
                    break;
                case 3:
                    System.out.printf("Tích: %d \n",x*y);
                    break;
                case 4:
                    if(y==0){
                        System.out.println("Không thể chia cho 0");
                    }else {
                        double thuong = x/y;
                        System.out.printf("Thương: %d \n", thuong);
                    }
                    break;
                case 5:
                    System.out.println("Sơ dư: %d \n"+x%y);
                    break;
                case 6:
                    for(int i = 1; i <= x && i <= y; i++)
                    {
                        if(x%i==0 && y%i==0)
                            ucln = i;
                    }
                    System.out.println("Uoc chung lon nhat: "+ucln);
                    break;
                case 7:
                    bcnn = (x * y) / ucln;
                    System.out.println("boi chung nho nhat: "+bcnn);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn số từ 1-8");
                    break;
            }
        }while (true);
    }
}
