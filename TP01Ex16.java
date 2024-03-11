import java.util.Scanner;
/* Alice da Silva
Matheus Leandro

16) Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. 
Lembre-se que uma função trigonométrica trabalha em radianos.

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 16");;
       System.out.print("Digite o valor do ângulo em graus: ");
       double anguloGraus = scan.nextDouble();


       // Converte o ângulo para radianos
       double anguloRadianos = Math.toRadians(anguloGraus);


       double seno = Math.sin(anguloRadianos);
       double cosseno = Math.cos(anguloRadianos);
       double tangente = seno / cosseno;
       double secante = 1 / cosseno;
       System.out.println("Seno: " + seno);
       System.out.println("Cosseno: " + cosseno);
       System.out.println("Tangente: " + tangente);
       System.out.println("Secante: " + secante);
   }}
     
