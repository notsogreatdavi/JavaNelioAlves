package src.EstruturaCondicional;

import java.util.Scanner;

public class Exercicio07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        float x,y;
        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.print("Eixo X");
        }
        else if (y == 0) {
            System.out.println("Eixo Y");
        }
        else if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }

        sc.close();
    }
}
