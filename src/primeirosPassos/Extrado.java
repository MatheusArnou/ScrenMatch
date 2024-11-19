package primeirosPassos;

import java.util.Scanner;

public class Extrado {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldoInicial = 2500;
        int op = 0;
        double valorRecebido = 0;
        double valorDeSaida = 0;
        String nome = "Matheus Bispo Arnou";


            System.out.println("*******************************");
            System.out.println("Dados do cliente");
            System.out.println("Tipo de conta: Corrente");
            System.out.println("Nome: " + nome);
            System.out.println("Saldo inicial: R$ %.2f".formatted(saldoInicial));
            System.out.println("\n*******************************");

        while(op != 4){

            System.out.println("Operações");
            System.out.println("1 | Consultar saldos");
            System.out.println("2 | Receber valor");
            System.out.println("3 | Transferir valor");
            System.out.println("4 | Sair");
            System.out.println("Escolha a opção");
            op = leitura.nextInt();

            if (op == 1) {
                System.out.println("*******************************");
                System.out.printf("Saldo atual: R$ %.2f%n", saldoInicial);
                System.out.println("\n*******************************");
            } else if (op == 2) {
                System.out.println("*******************************");
                System.out.print("Digite o valor a receber: R$ ");
                valorRecebido = leitura.nextDouble();
                saldoInicial += valorRecebido;
                System.out.println("\n*******************************");
                System.out.printf("Seu saldo atual é de R$ %.2f%n", saldoInicial);
            } else if (op == 3) {
                System.out.println("*******************************");
                System.out.print("Digite o valor a transferir: R$ ");
                valorDeSaida = leitura.nextDouble();
                if (valorDeSaida > saldoInicial) {
                    System.out.println("Seu saldo é menor que o valor a transferir.");
                } else {
                    saldoInicial -= valorDeSaida;
                    System.out.printf("Transferência concluída. Saldo atual: R$ %.2f%n", saldoInicial);
                }
                System.out.println("\n*******************************");
            } else if (op == 4) {
                System.out.println("Sistema encerrado.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        leitura.close();

    }
}

