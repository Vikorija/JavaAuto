package Lesson4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of rows for triangle: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            int m = 1;
            while (m <= 2 * i - 1) {
                System.out.print("*");
                m ++;
            }
            System.out.println();
        }
    }
}
