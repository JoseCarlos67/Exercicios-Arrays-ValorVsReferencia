import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void printSum(float[] vector) {
    float sum = 0;
    for (byte i = 0; i < vector.length; i++)
      sum += vector[i];

    System.out.printf("\n\nValor da soma = %.2f", sum);
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "4\n4.1\n6.7\n0.9\n15.67";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    byte n;
    System.out.println("Quantos números você vai digitar?");
    n = scanner.nextByte();

    float[] vector = new float[n];
    for (byte i = 0; i < n; i++) {
      System.out.println("Digite um número:");
      vector[i] = scanner.nextFloat();
    }
    System.out.print("\nValores:");
    for (byte i = 0; i < n; i++)
      System.out.print("  " + vector[i]);

    printSum(vector);
    scanner.close();
  }
}