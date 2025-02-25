package src.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code, quant;

        code = sc.nextInt();
        quant = sc.nextInt();
        double totalPrice;

        if (code == 1) {
            totalPrice = quant * 4.00;
        }
        else if (code == 2){
            totalPrice = quant * 4.50;
        }
        else if (code == 3){
            totalPrice = quant * 5.00;
        }
        else if (code == 4){
            totalPrice = quant * 2.00;
        }
        else {
            totalPrice = quant * 1.50;
        }

        System.out.printf("Total: R$ %.2f", totalPrice);

        sc.close();
    }

}
