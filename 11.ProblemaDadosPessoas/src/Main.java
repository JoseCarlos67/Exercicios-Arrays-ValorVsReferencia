import entites.People;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void fillPeopleVector(People[] peoples, Scanner scanner) {
    for (byte i = 0; i < peoples.length; i++) {
      scanner.nextLine();
      peoples[i] = new People();
      System.out.printf("\nAltura da %d° pessoa: ", i +1 );
      peoples[i].setHeight(scanner.nextFloat());
      System.out.printf("\nGênero da %d° pessoa: ", i +1 );
      System.out.println();
      peoples[i].setGender(scanner.next().charAt(0));
    }
  }

  public static void greatestAndSmallestHeight(People[] peoples) {
    float greatest = peoples[0].getHeight();
    float smallest = peoples[0].getHeight();

    for (byte i = 1; i < peoples.length; i++) {
      if (greatest < peoples[i].getHeight())
        greatest = peoples[i].getHeight();
      if (smallest > peoples[i].getHeight())
        smallest = peoples[i].getHeight();
    }

    System.out.println("\nMaior altura: " + greatest);
    System.out.println("Menor altura: " + smallest);
  }

  public static void averageHeightOfWomen(People[] peoples) {
    float sum = 0;
    byte cont = 0;
    for (byte i = 1; i < peoples.length; i++) {
      if (peoples[i].getGender() == 'F') {
        sum += peoples[i].getHeight();
        cont++;
      }
    }
    System.out.printf("Media das alturas das mulheres: %.2f", sum / cont);
  }

  public static void numberOfMen(People[] peoples) {
    byte cont = 0;
    for (byte i = 1; i < peoples.length; i++) {
      if (peoples[i].getGender() == 'M') {
        cont++;
      }
    }
    System.out.println("\nNumero de homens: " +cont);
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "5\n1.70\nF\n1.83\nM\n1.54\nM\n1.61\nF\n1.75\nF";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas? ");
    byte quantity = scanner.nextByte();

    People[] peoples = new People[quantity];
    fillPeopleVector(peoples, scanner);
    greatestAndSmallestHeight(peoples);
    averageHeightOfWomen(peoples);
    numberOfMen(peoples);
  }
}