import java.util.Scanner;
/* Alice da Silva
Matheus Leandro

10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 10");
       System.out.print("Digite a temperatura em graus Celsius: ");
       double temperaturaCelsius = scan.nextDouble();
       double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;


       System.out.println("A temperatura equivalente em Fahrenheit é: " + temperaturaFahrenheit + " graus Fahrenheit");
   }}
     
