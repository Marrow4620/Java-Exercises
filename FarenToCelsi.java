import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um valor em Fahrenheit ");
            double valor = input.nextDouble() -32;
            double resultado = valor/ 1.8;
            int casting = (int) resultado;
            System.out.println("O resultado é " + casting);

    }
}
