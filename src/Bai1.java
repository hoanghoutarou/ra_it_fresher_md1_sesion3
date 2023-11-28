// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bai1 {
    public static void main(String[] args) {
        System.out.printf("Cac so chan: ");
        int sum =0;
        for (int i =1;i<=10;i++){
            if (i%2==0){
                System.out.printf("%d\t ",i);
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Tổng số chẵn:"+sum);

    }
}