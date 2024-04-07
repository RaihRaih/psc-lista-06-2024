/*Raissa Rodrigues -Sist Info
3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela. */
import java.util.Scanner;

public class QuatroNotas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[] notas;
    notas = new double[4];

    for (int i = 0; i < notas.length; i++) {
      System.out.println("Nota " + (i + 1) + ":  ");
      notas[i] = scanner.nextDouble();
    }
    for (int i = notas.length - 1; i >= 0; i--) {
      System.out.println("Nota " + (i + 1) + ": " + notas[i]);
    }
    scanner.close();
  }
}
