package BaiTap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Printing the rectangle:");
                    for (int i = 0; i <= 3; i++) {
                        for (int j = 0; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Printing the square triangle:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Printing the isosceles triangle:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Xin moi nhap tu 1 den 4");

            }
        }while(true);

    }
}
