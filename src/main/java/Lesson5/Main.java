package Lesson5;
import Lesson3.CurrencyConverter;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number in format numerator/denominator:");
        String first = scan.nextLine();
        String[] arrayOfNumbers1 = first.split("/");
        int numerator1 = Integer.parseInt(arrayOfNumbers1[0]);
        int denominator1 = Integer.parseInt(arrayOfNumbers1[1]);
        Fraction  firstNumber = new Fraction(numerator1, denominator1);

        System.out.println("Enter second number in format numerator/denominator:");
        String second = scan.nextLine();
        String[] arrayOfNumbers2 = second.split("/");
        int numerator2 = Integer.parseInt(arrayOfNumbers2[0]);
        int denominator2 = Integer.parseInt(arrayOfNumbers2[1]);
        Fraction secondNumber = new Fraction(numerator2, denominator2);

        boolean result = firstNumber.equals(secondNumber);

        System.out.println("Result: " + result);
    }

}
