import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen");
        int x = sc.nextInt();
        do {
            System.out.println("Menu:");
            System.out.println("1. In day so chia het cho 2 va giam dan");
            System.out.println("2. In cac so nho hon n va tinh tong");
            System.out.println("3. In cac so uoc chan cua n");
            System.out.println("4. In cac so uoc le va so luong uoc le cua n");
            System.out.println("5. In ra uoc le lon nhat cua n");
            System.out.println("6. Thoat");
            System.out.print("Lựa chọn của bạn là: ");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Day so chia het cho 2 giam dan");
                    for(int i =x;i>0;i--){
                        if(i%2==0){
                            System.out.printf("%d \t",i);;
                        }
                    }
                    break;
                case 2:
                    int sum=0;
                    System.out.println("Cac so nho hon n:");
                    for(int i=x-1;i>0;i--){
                        sum+=i;
                        System.out.println(i);
                    }
                    System.out.println("Tong cua cac so nho hon n la "+sum);
                    break;
                case 3:
                    System.out.println("Cac uoc so chan:");
                    for(int i=0;i<=x;i++){
                        if(x%i==0 && i%2==0){
                            System.out.println(i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Cac uoc so le");
                    int count =0;
                    for(int i=0;i<=x;i++){
                        if(x%i!=0 && i%2!=0){
                            count++;
                            System.out.println(i);
                        }
                    }
                    System.out.println("So luong cac uoc le:" +count);
                    break;
                case 5:
                    int max =0;
                    for(int i=x;i>0;i++){
                        if(x%i!=0 && i%2!=0){
                            if(max<i){
                                max=i;
                            }
                        }
                    }
                    System.out.println(max);
                    break;
                case 6:
                    break;
                default:
                    System.err.println("Hay nhap lua chon tu 1-6");
            }
        }while(true);
    }
}
