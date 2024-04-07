/*Raissa Rodrigues - Sist. Info
 * 5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
Armazene os números pares no vetor PAR e os números IMPARES no vetor
ímpar. Imprima os três vetores.
 */
import java.util.Scanner;

public class VinteNumerosInteiros {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int vetor[];
    vetor = new int[20];
    int impar = 0;
    int par = 0;

    System.out.println("Digite 20 valores:");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = scanner.nextInt();

      if (vetor[i] % 2 != 0) {
        impar++;
      } else {
        par++;
      }
    }
    System.out.println("Numeros Pares: " + par + "\nNumeros Impares: " + impar);

    scanner.close();
  }
}
