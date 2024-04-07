/*Raissa Rodrigues - Sistemas de Informação
 * 2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na
ordem inversa.
 */
import java.util.Scanner;

public class Vetor10num {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double[] num = new double[10]; // Criação do vetor com 10 posições

    for (int i = 0; i < num.length; i++) {
      System.out.print("Digite o valor na posição " + i + ": ");
      num[i] = scanner.nextDouble();
    }
    for (int i = num.length - 1; i >= 0; i--) {
      System.out.println("Valor na posição " + i + ": " + num[i]);
    }
    scanner.close();
  }
}
