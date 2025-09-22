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

  public static void greaterValue(byte[] vector) {
    byte indexGreaterValue = 0;

    for (byte i = 1; i < vector.length; i++) {
      if (vector[i] > vector[indexGreaterValue])
        indexGreaterValue = i;
    }

    System.out.printf("\n\nMAIOR VALOR = %d\n", vector[indexGreaterValue]);
    System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", indexGreaterValue);
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "6\n8\n4\n\n10\n14\n13\n7";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números deseja digitar? ");
    byte quantity = scanner.nextByte();
    byte[] vector = new byte[quantity];

    fillVector(vector, scanner);
    greaterValue(vector);

  }
}