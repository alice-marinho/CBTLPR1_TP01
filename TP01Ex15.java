import java.util.Scanner;

/* Alice da Silva
Matheus Leandro

15) Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$)

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);

  System.out.print("Exercicio 15");
       System.out.print("Digite a cotação do dólar: ");
       double cotacaoDolar = scan.nextDouble();
       System.out.print("Digite a quantidade de dólares: ");
       double quantidadeDolares = scan.nextDouble();
       double valorEmReais = quantidadeDolares * cotacaoDolar;


       System.out.println("O valor correspondente em Reais é: R$" + valorEmReais);
   }}
