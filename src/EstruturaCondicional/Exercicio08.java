package src.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio08 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double sal = sc.nextDouble();
        double imposto;

        if (sal <= 2000) {
            imposto = 0;
        }
        else if (sal <= 3000) {
            imposto = (sal - 2000) * 0.08;
        }
        else if (sal <= 4500) {
            imposto = (sal - 3000) * 0.18 + 1000 * 0.08;
        }
        else  {
            imposto = (sal - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f", imposto);
        }
        sc.close();
    }
}
