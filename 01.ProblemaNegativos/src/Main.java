import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInput = "13\n10\n1\n-2\n3\n4\n-5\n6\n7\n-8\n9\n10";
    ByteArrayInputStream fakeIn = new ByteArrayInputStream(fakeInput.getBytes());
    System.setIn(fakeIn);
    Scanner scanner = new Scanner(System.in);

    byte n;
    System.out.println("Quantos números você vai digitar? ");
    n = scanner.nextByte();

    while (n > 10 || n < 0) {
      System.out.println("A quantidade de números de ser maior do que 0 e menor do que 10! Digite novamente: ");
        n = scanner.nextByte();
    }

    int[] vector = new int[n];
    for (byte i = 0; i < n; i++) {
      vector[i] = scanner.nextInt();
    }

    for (byte i = 0; i < n; i++)
      System.out.println(vector[i]);

    System.out.println("\nNÚMEROS NEGATIVOS:");
    byte count = 0;
    for (int i = 0; i < n; i++) {
      if (vector[i] < 0) {
        System.out.println(vector[i]);
        count++;
      }
    }
    if (count == 0)
      System.out.println("NÃO HÁ NÚMEROS NEGATIVOS!");

    scanner.close();
    }
}