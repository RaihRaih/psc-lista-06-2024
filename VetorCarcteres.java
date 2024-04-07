/*Raissa Rodrigues = Sist Info
4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas
consoantes foram lidas. Imprima as consoantes. */
import java.util.Scanner;

public class VetorCarcteres {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] caracteres;
    caracteres = new char[10];
    int numConsoantes = 0;

    for (int i = 0; i < caracteres.length; i++) {
      System.out.print("Digite o valor na posição " + (i + 1) + ": ");
      caracteres[i] = scanner.next().charAt(0);

      if (
        caracteres[i] != 'a' &&
        caracteres[i] != 'A' &&
        caracteres[i] != 'e' &&
        caracteres[i] != 'E' &&
        caracteres[i] != 'i' &&
        caracteres[i] != 'I' &&
        caracteres[i] != 'o' &&
        caracteres[i] != 'O' &&
        caracteres[i] != 'u' &&
        caracteres[i] != 'U'
      ) {
        numConsoantes++; // Incrementa o contador de consoantes
      }
    }
    System.out.println("Total de consoantes: " + numConsoantes);
    scanner.close();
  }
}
