import java.util.Scanner;

/* Alice da Silva
Matheus Leandro

8) Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 8");
       System.out.print("Converte milha marítima para quilômetros. Digite o valor de milha marítima:");
       double milha = scan.nextDouble();


       double kilom = milha * 1.852 ;


       System.out.println("O valor em quilômetros é de " + kilom);
   }}
     
