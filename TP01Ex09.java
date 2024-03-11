import java.util.Scanner;

/* Alice da Silva
Matheus Leandro

9) Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm. 

*/


public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 9");
       System.out.print("Digite o valor da resistência (em ohms): ");
       double resistencia = scan.nextDouble();
       System.out.print("Digite o valor da corrente (em amperes): ");
       double corrente = scan.nextDouble();


       double tensao = corrente * resistencia;


       System.out.println("A tensão no circuito é: " + tensao + " volts");
   }}
