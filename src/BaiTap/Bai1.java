package BaiTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số đầu");
        int start = sc.nextInt();
        System.out.println("nhập số cuoi");
        int end = sc.nextInt();

        int sum = 0;
        for(int i = start; i<end+1;i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("Tổng của các số chẵn trong khoảng đó là "+sum);
    }
}
