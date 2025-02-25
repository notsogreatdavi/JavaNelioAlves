package src.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code, quant;

        code = sc.nextInt();
        quant = sc.nextInt();

        double totalPrice = 0;
        switch (code) {
        case 1:
            totalPrice = quant * 4.00;
            break;

        case 2:
            totalPrice = quant * 4.50;
            break;

        case 3:
            totalPrice = quant * 5.00;
            break;

        case 4:
            totalPrice = quant * 2.00;
            break;

        case 5:
            totalPrice = quant * 1.50;
            break;
        default:
            System.out.print("CODIGO INVALIDO");
            break;
        }

        System.out.printf("Total: R$ %.2f", totalPrice);

        sc.close();
    }

}
