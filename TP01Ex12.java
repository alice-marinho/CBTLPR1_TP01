import java.util.Scanner;

/* Alice da Silva
Matheus Leandro

12) Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 12");
       System.out.print("Digite o raio da base do cone: ");
       double raio = scan.nextDouble();
       System.out.print("Digite a altura do cone: ");
       double altura = scan.nextDouble();


       double volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;


       System.out.println("O volume do cone é: " + volume);}}
