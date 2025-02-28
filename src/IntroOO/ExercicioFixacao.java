package src.IntroOO;

import src.IntroOO.util.CurrencyConverter;

import java.util.Scanner;

public class ExercicioFixacao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.toDollar(price, dollar));
        sc.close();
   }
}
