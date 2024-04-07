/*Raissa Rodrigues - Sistemas de Informação
 * 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */
import java.util.Scanner;

public class Vetor5num {

  public static void main(String[] args) {
    int num[]; // Declaração do vetor
    Scanner scanner = new Scanner(System.in);

    num = new int[5]; // Inicializar vetor

    for (int i = 0; i < num.length; i++) {
      System.out.print("Digite o valor na posição " + i + ": ");
      num[i] = scanner.nextInt();
    }

    // Exemplo de impressão dos valores do vetor:
    for (int i = 0; i < num.length; i++) {
      System.out.println("Valor na posição " + i + ": " + num[i]);
    }
    scanner.close();
  }
}
