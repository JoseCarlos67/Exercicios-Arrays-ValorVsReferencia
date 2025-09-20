import entites.People;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static float mediaHeight(People[] peoples) {
    float sumHeight = 0;
    for (byte i = 0; i < peoples.length; i++)
      sumHeight += peoples[i].getHeight();

    return sumHeight / peoples.length;
  }

  public static byte percentageOfPeopleUnder16YearsOld(People[] peoples) {
    byte count = 0;
    for (int i = 0; i < peoples.length; i++) {
      if (peoples[i].getAge() < 16)
        count++;
    }

    float result =  ((float) count / peoples.length) * 100;
    return (byte) result;
  }

  public static void nameOfPeopleUnder16YearsOld(People[] peoples) {
    for (int i = 0; i < peoples.length; i++) {
      if (peoples[i].getAge() < 16)
        System.out.println(peoples[i].getName());
    }
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "5\nJoao\n15\n1.82\nMaria\n16\n1.60\nTeresa\n14\n1.58\nCarlos\n21\n1.65\nPaulo\n17\n1.78";
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

      if (i <= 3)
        scanner.nextLine();
    }

    float mediaHeight = mediaHeight(peoples);
    System.out.printf("\n\nAltura média: %.2f\n", mediaHeight);

    byte under16YearsOld = percentageOfPeopleUnder16YearsOld(peoples);
    System.out.printf("\nPessoas com menos de 16 anos: %d%%\n", under16YearsOld);
    nameOfPeopleUnder16YearsOld(peoples);

    scanner.close();
  }
}