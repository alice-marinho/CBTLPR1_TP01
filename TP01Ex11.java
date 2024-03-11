import java.util.Scanner;
/* Alice da Silva
Matheus Leandro

11) A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área

*/
public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 11");
       System.out.print("Digite o diâmetro do círculo: ");
       double diametro = scan.nextDouble();
       double raio = diametro / 2;
       double area = Math.PI * Math.pow(raio, 2);


       System.out.println("A área do círculo é: " + area);}}
     
