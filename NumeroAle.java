import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        int number = new Random().nextInt(50);

        for (int contTenta = 0; contTenta < 5; contTenta++) {
            System.out.println("Acerte o numero aleatorio");
            int colocado = input.nextInt();
            if (number == colocado) {
                System.out.println("Você acertou o número era " + colocado);
                break;
                
            } else if (contTenta == 4) {
                System.out.println("o numero era " + number);
            } else if (number < colocado) {
                System.out.println("O numero é menor do que vc colocou");
            } else  {
                System.out.println("o numero é maior que o colocado");
            }
        }
    }
}

