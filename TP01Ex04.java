import java.util.Scanner;
/* Alice da Silva
Matheus Leandro

4) A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.println("Para calcular a área de um triângulo, insira o valor da base:");
       double baseTri = scan.nextInt();
       System.out.println("Insira o valor da altura:");
       double alturaTri = scan.nextInt();
       double areaTri = (baseTri * alturaTri) / 2;
       System.out.println("O valor da area do triângulo é de " + areaTri);
   }}
     
