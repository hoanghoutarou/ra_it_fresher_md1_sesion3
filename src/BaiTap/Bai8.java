package BaiTap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Cạnh thứ nhất của tam giác ");
            double a = sc.nextDouble();
            System.out.println("Cạnh thứ hai của tam giác ");
            double b = sc.nextDouble();
            System.out.println("Cạnh thứ ba của tam giác ");
            double c = sc.nextDouble();

            if(a+b <=c || a+c <=b || b+c <=a){
                System.out.println("Đây không phải ba cạnh của tam giác");
            }else {
                System.out.println("Đây là ba cạnh của tam giác");
            }
        }
    }
}
