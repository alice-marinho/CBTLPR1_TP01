import java.util.Scanner;

/* 
Alice da Silva
Matheus Leandro

3) Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.println("Exercício 3");
       System.out.println("Para calcular a área de um quadrado, digite o valor da sua diagonal:");
       double diagonalQuad = scan.nextDouble();
       double ladoQuad = diagonalQuad / Math.sqrt(2);
       double areaQua = ladoQuad * ladoQuad;

       System.out.println("O valor do lado do quadrado é de "+ Math.round(ladoQuad) + " e a área é de "+ Math.round(areaQua));}}
