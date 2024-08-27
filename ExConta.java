import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Guilherme Vale";
        String tipoCon = "Corrente";
        int Sald = 2500;

        Scanner input = new Scanner(System.in);
        System.out.println("Dados iniciais do Cliente:");
        System.out.println("Nome:" + nome);
        System.out.println("Tipo conta " + tipoCon);
        System.out.println("Saldo inicial " + Sald);

        System.out.println("Operações");
        int valor = 0;
        int escolheop = 0;
        //int consulSald = 1;
        //int recebevalo = 2;
        //int tranferir = 3;
        while (escolheop != 4) {
            System.out.println("Escolha uma opção");
            escolheop = input.nextInt();
            if (escolheop == 1) {
                System.out.println("O saldo atual é " + Sald);
            } else if (escolheop == 2) {
                System.out.println("Quanto Deseja receber?");
                Sald += input.nextInt();
                System.out.println("O saldo atual é " + Sald);

            } else if (escolheop == 3) {
                System.out.println("Quanto desesja tranferir? ");

                valor = input.nextInt();
                if (valor > Sald) {
                    System.out.println("Você não tem saldo o suficiente");
                } else if (valor < Sald) {
                   Sald -= valor;


                }
                System.out.println("o saldo atual é " + Sald);
            }else if (escolheop != 4){
                System.out.println("Digite uma opção valida");
            }
        }
    }
           }


