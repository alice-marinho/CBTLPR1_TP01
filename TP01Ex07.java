import java.util.Scanner;

/* Alice da Silva
Matheus Leandro

Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Exercicio 7");
       System.out.println("Para calcular a média geometrica, digite o primeiro número:");
       double primeiroNum = scan.nextDouble();
       System.out.println("Digite o segundo número:");
       double segundoNum = scan.nextDouble();
       double mediaGeo = Math.round(Math.sqrt(primeiroNum * segundoNum));


       System.out.println("Média geometrica é aproximadamente de " + mediaGeo);

