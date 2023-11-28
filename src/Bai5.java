import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn bảng cửu chương:");
        int x= scanner.nextInt();
        System.out.printf("Bảng cứu chương %d: \n",x );
        for (int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d \n",i,x,i*x);
        }
    }
}
