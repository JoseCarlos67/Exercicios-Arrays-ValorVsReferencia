import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void fillVector(byte[] vector, Scanner scanner) {
    for (byte i = 0; i < vector.length; i++) {
      System.out.print("\nDigite um número: ");
      vector[i] = scanner.nextByte();
    }
  }

  public static void arithmeticMeanVector(byte[] vector) {
    float sum = 0;
    int cont = 0;

    for (byte i = 0; i < vector.length; i++)
      if (vector[i] % 2 == 0) {
        sum += vector[i];
        cont++;
      }

    float aritmeticMean = sum / cont;

    if (cont == 0)
      System.out.println("\nNENHUM NÚMERO PAR!");
    else
      System.out.printf("\nMÉDIA DOS PARES = %.1f", aritmeticMean);

    System.out.println();
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    //String fakeInputString = "6\n8\n2\n11\n14\n13\n20";
    String fakeInputString = "3\n7\n9\n11";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos elementos terá o vetor? ");
    byte quantity = scanner.nextByte();

    byte[] vector = new byte[quantity];
    fillVector(vector, scanner);
    arithmeticMeanVector(vector);
  }
}