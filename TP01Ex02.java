import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     /*
     Dupla: 
     Alice da Silva,
     Matheus Leandro

     2) Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
     */
  System.out.println("Exercício 2");
       System.out.println("Para calcular a área de um quadrado, informe a aresta do quadrado:");
       int arestaQuad = scan.nextInt();
       int areaQuad= arestaQuad*arestaQuad;

System.out.println("A área do quadrado informado é de " + areaQuad);
   }
}
