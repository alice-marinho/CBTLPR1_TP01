import java.util.Scanner;
/* Alice da Silva
Matheus Leandro

17) Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. 

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 17");


       System.out.print("Digite o valor de X: ");
       double x = scan.nextDouble();
       System.out.print("Digite o valor de Y: ");
       double y = scan.nextDouble();
       double resultadoPotencia = Math.pow(x, y);
       double resultadoExp = Math.exp(y * Math.log(x));


       System.out.println("Resultado de X^Y: " + resultadoPotencia);
       System.out.println("Resultado usando Exp e Ln: " + resultadoExp); 
   }}
