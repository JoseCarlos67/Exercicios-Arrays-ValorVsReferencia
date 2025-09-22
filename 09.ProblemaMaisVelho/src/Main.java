import entities.People;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void fillPeopleVector(People[] vector, Scanner scanner) {
    for (byte i = 0; i < vector.length; i++){
      scanner.nextLine();
      vector[i] = new People();
      System.out.printf("\nDados da %da pessoa:\n", i+1);
      System.out.print("Nome: ");
      vector[i].setName(scanner.nextLine());
      System.out.print("\nIdade: ");
      vector[i].setAge(scanner.nextByte());
      System.out.println();
    }
  }

  public static void olderPerson(People[] peoples) {
    byte index = 0;
    for (byte i = 1; i < peoples.length; i++) {
      if (peoples[i].getAge() > peoples[index].getAge())
        index = i;
    }

    System.out.println("\nPESSOA MAIS VELHA: " + peoples[index].getName());
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "5\nJoao\n16\nMaria\n21\nTeresa\n15\nCarlos\n23\nPaulo\n17";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas pessoas você deseja cadastrar? ");
    byte quantity = scanner.nextByte();

    People[] peoples = new People[quantity];
    fillPeopleVector(peoples, scanner);
    olderPerson(peoples);
  }
}