/*Raissa Rodrigues - Sistemas de Informacao
 * 7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a
multiplicação e os números.
 */

import java.util.Scanner;

public class SomaEMultiplicacao {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[5];
    int soma = 0;
    int multiplicacao = 1;

    // Entrada dos números
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
      numeros[i] = scanner.nextInt();
    }

    // Soma e multiplicação dos números
    for (int i = 0; i < 5; i++) {
      soma += numeros[i];
      multiplicacao *= numeros[i];
    }

    // Saída dos números
    System.out.println("Números digitados:");
    for (int i = 0; i < 5; i++) {
      System.out.print(numeros[i] + " ");
    }

    // Saída da soma e multiplicação
    System.out.println("\nSoma dos números: " + soma);
    System.out.println("Multiplicação dos números: " + multiplicacao);

    scanner.close();
  }
}
