package BaiTap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int N = 1;
        while (N%5!=0 || N%7!=0 || N%11!=0){
            N++;
        }
        System.out.println("So nguyen duong nho nhat chia het 5,7 va 11:  "+N);
    }
}
