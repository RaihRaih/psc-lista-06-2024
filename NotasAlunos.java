/*Raissa Rodrigues - Sistemas de Info.
 * Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene
num vetor a média de cada aluno, imprima o número de alunos com média
maior ou igual a 7.0. */
import java.util.Scanner;

public class NotasAlunos {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numAlunos = 10;
    double[] medias = new double[numAlunos];
    double[][] notas = new double[numAlunos][4];
    int aprovados = 0;

    for (int i = 0; i < numAlunos; i++) {
      System.out.println("Aluno " + (i + 1));
      double soma = 0;
      for (int j = 0; j < 4; j++) {
        System.out.println("Informe a " + (j + 1) + "ª nota do aluno:");
        notas[i][j] = scanner.nextDouble();
        soma += notas[i][j];
      }
      // Calcula a média do aluno
      medias[i] = soma / 4;
      // Verifica se a média é maior ou igual a 7.0
      if (medias[i] >= 7.0) {
        aprovados++;
      }
    }
    System.out.println(
      "Número de alunos com média maior ou igual a 7.0: " + aprovados
    );

    scanner.close();
  }
}
