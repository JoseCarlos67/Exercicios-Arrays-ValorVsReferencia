import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static float sumVector(float[] vector) {
    float sum = 0;
    for (byte i = 0; i < vector.length; i++)
      sum += vector[i];

    return sum;
  }

  public static float mediaVector(float sum, byte n) {
    return sum/n;
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "4\n8\n4\n10\n14";
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

    float sum =  sumVector(vector);
    System.out.printf("\n\nValor da soma = %.2f", sum);

    float media =  mediaVector(sum, n);
    System.out.printf("\nValor da soma = %.2f", media);

    scanner.close();
  }
}