package BaiTap;

import java.util.Scanner;

public class Bai4 {
    public static boolean check(int x) {
        if(x<1){
            return false;
        } else if (x==2) {
            return true;
        } else if (x>2) {
            for(int i=2;i<x;i++){
                if(x%i==0){
                    return false;

                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào số số nguyên tố mà bạn muốn in ra");
        int x = sc.nextInt();
        int count = 0;
        int primeNumber = 1;
        while (count<x){
            while (check(primeNumber)==false){
                primeNumber++;
            }
            System.out.println(primeNumber);
            primeNumber++;
            count++;
        }
    }
}
