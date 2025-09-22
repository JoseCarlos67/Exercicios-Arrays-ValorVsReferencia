import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void fillVector(byte[] vector, Scanner scanner, char identifier) {
    System.out.printf("Digite os valores do vetor %c:\n", identifier);
    for (byte i = 0; i < vector.length; i++)
      vector[i] = scanner.nextByte();
  }

  public static void printVector(byte[] vector, char identifier) {
    System.out.printf("\nVetor %c: ", identifier);
    for (byte i = 0; i < vector.length; i++)
      System.out.printf(vector[i] + " ");

    System.out.println();
  }

  public static void sumVectors(byte[] vectorA, byte[] vectorB, byte[] vectorC) {
    for (byte i = 0; i < vectorA.length; i++)
      vectorC[i] = (byte) (vectorA[i] + vectorB[i]);
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "6\n" +
            "8\n" +
            "2\n" +
            "11\n" +
            "14\n" +
            "13\n" +
            "20\n" +
            "5\n" +
            "10\n" +
            "3\n" +
            "1\n" +
            "10\n" +
            "7";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos valores vai ter cada vetor? ");
    byte quantity = scanner.nextByte();
    System.out.println();
    byte[] vectorA = new byte[quantity];
    byte[] vectorB = new byte[quantity];

    fillVector(vectorA, scanner, 'A');
    fillVector(vectorB, scanner, 'B');
    printVector(vectorA, 'A');
    printVector(vectorB, 'B');

    byte[] vectorC = new byte[quantity];
    sumVectors(vectorA, vectorB, vectorC);
    printVector(vectorC, 'C');

  }
}