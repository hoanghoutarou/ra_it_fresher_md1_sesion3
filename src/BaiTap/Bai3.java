package BaiTap;

public class Bai3 {
    public static boolean check(int x){
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
        for (int i = 2;i<=100;i++){
            if(check(i)){
                System.out.println("Số nguyên tố "+i);
            }
        }
    }
}
