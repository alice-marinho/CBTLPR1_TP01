import java.util.Scanner;
/* Alice da Silva
Matheus Leandro

5) Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.println("Exercício 5");
       System.out.println("Para calcular o volume de uma esfera, digite o valor do diâmetro");
       double diametroEsf = scan.nextDouble();
       double raioEsf = (diametroEsf / 2);
       double volumeEsf = (4* Math.PI * Math.pow(raioEsf, 3)/3);
       System.out.println("O volume da esfera é de aproximadamente " + Math.round(volumeEsf));

   }}
