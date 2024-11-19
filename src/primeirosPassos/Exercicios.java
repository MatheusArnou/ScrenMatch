package primeirosPassos;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        //calcular média
        double nota1,nota2, media;
        nota1 = 5.89;
        nota2 = 6.34;

        media = (nota1+nota2)/2;

        System.out.printf("Sua média final foi de %.2f: %n", media);

        /*Declare uma variável do tipo double e uma
        variável do tipo int. Faça o casting da variável double para int e imprima o resultado.*/

        int notafinal = (int)(media);

        System.out.println(notafinal);
        /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente
        o resultado em uma mensagem.
         */
        int quantidade;
        double precoProduto;

        quantidade = 10;
        precoProduto = 9.85;

        precoProduto *= quantidade;

        System.out.printf("Você tem %d quantidade, e o preço unitário é R$ 9,85 valor total R$: %.2f%n", quantidade,precoProduto);
        char letra = 'M';
        String nome = "atheus";

        System.out.println(letra+nome);

        /*Declare uma variável do tipo double valorEmDolares.
        Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
         */
        double valorDolar = 50.00;
        double valorReal = 5.89;

        valorReal *= valorDolar;

        System.out.printf("Convertendo Dolar para real brasileiro R$: %.2f%n", valorReal);

        /*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo
        double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
         */

        double precoOriginal;
        double desconto;

        precoOriginal = 150.58;
        desconto = 0.16;

        precoOriginal = precoOriginal - (precoOriginal * desconto);
        System.out.printf("Preço do produto com desconto R$': %.2f %n", precoOriginal);


        //primeirosPassos.Exercicios IF/Else, leitura de dados e Loops

        /*Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/

        Scanner leitura = new Scanner(System.in);
        int numDigitado;
        int numDigitado2;
        System.out.println("Digite um número");
        numDigitado = leitura.nextInt();
        System.out.println("Digite outro número");
        numDigitado2 = leitura.nextInt();
        if(numDigitado < 0){
            System.out.println("É menor que zero");
        } else {
            System.out.println("É maior que zero");
        }
        /*Peça ao usuário para inserir dois números inteiros. Compare os números
        e imprima uma mensagem indicando se são iguais,
        diferentes, o primeiro é maior ou o segundo é maior.
        */
        if (numDigitado == numDigitado2) {
            System.out.println("São iguais");
        } else if (numDigitado != numDigitado2) {
            System.out.println("São diferentes");
            if (numDigitado > numDigitado2){
                System.out.println("O primeiro número é menor que o segundo ");
            }
            else {
                System.out.println("O primeiro número é menor que o segundo ");
              }
        }

    }



}
