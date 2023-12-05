package Lesson3;

public class CurrencyConverter {
    private double commission ;
    private double exchangeRate;
    public CurrencyConverter() {
        this.commission = 1.0;
        this.exchangeRate = 36.55;
    }
    private double convertUsdToUah(double dolars){
        return dolars * exchangeRate;
    }
    private double calculateCommission(double dolars){
      return dolars * exchangeRate / 100;
    }
    public double calculateTotalAmount(double dolars) {
        double inUA = convertUsdToUah(dolars);
        double totalCommission = calculateCommission(dolars);
        return inUA + totalCommission;
    }
}