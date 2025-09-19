import entites.People;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "1\nJoao\n15\n1.82";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas? ");
    byte n = scanner.nextByte();
    scanner.nextLine();

    People[] peoples = new People[n];

    for (byte i = 0; i < n; i++) {
      peoples[i] = new People();

      System.out.print("\nNome: ");
      String name = scanner.nextLine();
      peoples[i].setName(name);

      System.out.print("\nIdade: ");
      byte age = scanner.nextByte();
      peoples[i].setAge(age);
      scanner.nextLine();

      System.out.print("\nAltura: ");
      float height = scanner.nextFloat();
      peoples[i].setHeight(height);


      scanner.nextLine(); // consome o ENTER depois do número
    }


    scanner.close();
  }
}