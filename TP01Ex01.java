import java.util.Scanner;


public class Main {
   public static void main(String[] args) {

     /*
     Dupla: 
     Alice da Silva
     Matheus Leandro
     
     1) Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.*/
       Scanner scan= new Scanner(System.in);
       System.out.println("Exercício 1");
       System.out.println("Para calcular a área do retângulo, informe primeiro a altura:");
       int altura= scan.nextInt();
       System.out.println("Informe a base:");
       int base=scan.nextInt();


       int areaRetan= (altura * base);
       System.out.println("A área do retângulo informado é de " + areaRetan);
     
