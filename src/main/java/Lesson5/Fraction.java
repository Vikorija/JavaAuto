package Lesson5;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
     public boolean equals(Fraction other) {
         return this.numerator * other.denominator == other.numerator * this.denominator;
     }

}
