package primeirosPassos;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numGerado = new Random().nextInt(100);
        int tentativas = 1;
        int numDigitado = 0;

        while (tentativas < 5){
            System.out.println("Digite um número: ");
            numDigitado = leitura.nextInt();
            tentativas++;

            if(numDigitado == numGerado) {
                System.out.println("Achou o número");
                break;
            } else if (numDigitado < numGerado) {
                System.out.println("Número digitado é menor que o digitado");
            } else {
                System.out.println("Númeoro digitado é maior que o digitado");
            }
        }

        if(tentativas == 5 && numDigitado == numGerado){
            System.out.println("Você não achou o númeor secreto");
        }
    }
}
