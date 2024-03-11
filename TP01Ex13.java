import java.util.Scanner;
/* Alice da Silva
Matheus Leandro

13) Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso (em s) que serão digitados.
*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 13");


       System.out.print("Digite a velocidade inicial (em m/s): ");
       double velocidadeInicial = scan.nextDouble();
       System.out.print("Digite a aceleração (em m/s²): ");
       double aceleracao = scan.nextDouble();
       System.out.print("Digite o tempo de percurso (em segundos): ");
       double tempo = scan.nextDouble();
       double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);
       double velocidadeFinalKmh = velocidadeFinal * 3.6;


       System.out.println("A velocidade final do automóvel é: " + velocidadeFinalKmh + " km/h");}}
