package src.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, result;
        a = sc.nextInt();
        b = sc.nextInt();

        result = a + b;
        System.out.printf("SOMA: %d", result);

        sc.close();
    }

}
