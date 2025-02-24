package src;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R, A;
        R = sc.nextDouble();

        A = 3.14159 * (R * R);

        System.out.printf("A = %.4f", A);
        sc.close();
    }
}
