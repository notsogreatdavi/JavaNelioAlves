package src;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangle, circle, trapezium, square, rectangle;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangle = (A * C)/2;
        circle = 3.14159 * C *C;
        trapezium = ((A+B) * C)/2;
        square = B * B;
        rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO %.3f", triangle, circle, trapezium, square, rectangle);
        sc.close();
    }
}
