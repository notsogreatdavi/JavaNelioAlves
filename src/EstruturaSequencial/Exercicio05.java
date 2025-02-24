package src.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int keyCode1, keyQuant1, keyCode2, keyQuant2;
        double keyValue1, keyValue2, total;

        keyCode1 = sc.nextInt();
        keyQuant1 = sc.nextInt();
        keyValue1 = sc.nextDouble();
        keyCode2 = sc.nextInt();
        keyQuant2 = sc.nextInt();
        keyValue2 = sc.nextDouble();

        total = (keyValue1 * keyQuant1) + (keyValue2 * keyQuant2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        sc.close();
    }
}
