import java.util.Scanner;
/* Alice da Silva
Matheus Leandro

18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido

*/

public class Main {
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
     System.out.print("Exercicio 18");
       double somaTotal = 0;
       for (int i = 1; i <= 5; i++) {
           System.out.print("Digite o valor do produto " + i + ": ");
           somaTotal += scan.nextDouble();
       }
      
       System.out.print("Digite o valor do pagamento: ");
       double valorPagamento = scan.nextDouble();
       double troco = valorPagamento - somaTotal;
      
       System.out.println("Soma total dos produtos: R$" + somaTotal);
       System.out.println("Troco a ser devolvido: R$" + troco);
   }
}
     
