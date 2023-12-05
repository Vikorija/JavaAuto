package Lesson3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter convert = new CurrencyConverter();

        Scanner scan = new Scanner(System.in);
        System.out.println("What amount of USD do you want to change: ");
        double dolars = scan.nextDouble();

        double totalAmount = convert.calculateTotalAmount(dolars);
        //double roundedTotalAmount = Math.ceil(totalAmount);
        System.out.println("Total amount: " + totalAmount);
        scan.close();
    }
}

