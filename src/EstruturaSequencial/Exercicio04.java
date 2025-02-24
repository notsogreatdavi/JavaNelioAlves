package src.EstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int funcionario, horast;
        double valorhora, salario;

        funcionario = sc.nextInt();
        horast = sc.nextInt();
        valorhora = sc.nextDouble();

        salario = valorhora * horast;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", funcionario, salario);

        sc.close();
    }
}
