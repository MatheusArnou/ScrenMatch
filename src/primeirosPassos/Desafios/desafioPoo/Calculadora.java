package primeirosPassos.Desafios.desafioPoo;
/*Crie uma classe Calculadora com um
método que recebe um número como parâmetro e
retorna o dobro desse número.*/

public class Calculadora {
   int numeroDobrar;

   void DobrarNumero(int numero){
       numero = numero * 2;
       numeroDobrar = numero;
   }
   int RetornoNumeroDobrado(){
       return numeroDobrar;
   }
}
