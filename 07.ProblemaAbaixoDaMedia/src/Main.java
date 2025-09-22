import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void fillVector(float[] vector, Scanner scanner) {
    for (byte i = 0; i < vector.length; i++) {
      System.out.print("\nDigite um número: ");
      vector[i] = scanner.nextFloat();
    }
  }

  public static void arithmeticMeanVector(float[] vector) {
    float sum = 0;
    for (byte i = 0; i < vector.length; i++)
      sum += vector[i];
    float aritmeticMean = sum / vector.length;
    System.out.printf("\n\nMEDIA DO VETOR: %.3f", aritmeticMean);
    System.out.print("\nELEMENTOS ABAIXO DA MÉDIA:");
    for (byte i = 0; i < vector.length; i++) {
      if (vector[i] < aritmeticMean)
        System.out.printf(" %.1f", vector[i]);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "4\n10\n15.5\n13.2\n9.8";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    byte quantity = scanner.nextByte();

    float[] vector = new float[quantity];
    fillVector(vector, scanner);
    arithmeticMeanVector(vector);


  }
}