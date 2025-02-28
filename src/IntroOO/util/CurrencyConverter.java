package src.IntroOO.util;

public class CurrencyConverter {

    public static double toDollar(double price, double dollar) {
       return dollar * price + (dollar * price * 0.06);

    }
}
