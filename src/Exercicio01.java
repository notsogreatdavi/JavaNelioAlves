import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int result;
        a = sc.nextInt();
        b = sc.nextInt();

        result = a + b;
        System.out.printf("SOMA: %d", result);
    }

}
