import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void fillVecotr(byte[] vector, Scanner scanner) {
    for (byte i = 0; i < vector.length; i++) {
      System.out.println("Digite um número: ");
      vector[i] = scanner.nextByte();
    }
    scanner.close();
  }

  public static void evenNumbers(byte[] vector) {
    byte count = 0;
    System.out.println("\nNÚMEROS PARES:");
    for (byte i = 0; i < vector.length; i ++) {
      if (vector[i] % 2 == 0) {
        System.out.print(vector[i] + " ");
        count++;
      }
    }
    System.out.println("\n\nQUANTIDADE DE NÚMEROS PARES: " + count);
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "6\n8\n2\n11\n14\n13\n20";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner sacanner = new Scanner(System.in);

    System.out.print("Quantos números você deseja digitar: ");
    byte quantity = sacanner.nextByte();

    byte[] vector = new byte[quantity];
    fillVecotr(vector, sacanner);
    evenNumbers(vector);

  }
}