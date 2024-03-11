import java.util.Scanner;

/* Alice da Silva
Matheus Leandro

14) Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados.

*/

public class Main {
   public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     
     System.out.print("Exercicio 14");
       System.out.print("Digite o raio da esfera (em unidades): ");
       double raio = scan.nextDouble();
       System.out.print("Digite a aresta do cubo (em unidades): ");
       double aresta = scan.nextDouble();
       double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
       double volumeCubo = Math.pow(aresta, 3);
       double volumeLivre = volumeCubo - volumeEsfera;


       System.out.println("O volume livre do ambiente é: " + volumeLivre + " unidades cúbicas");}}
