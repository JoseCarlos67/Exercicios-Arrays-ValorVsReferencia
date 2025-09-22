import entities.Student;

import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void fillStudentVector(Student[] students, Scanner scanner) {
    for (byte i = 0; i < students.length; i++) {
      scanner.nextLine();
      students[i] = new Student();
      System.out.printf("Digite o nome, a primeira e a segunda noda do %d° aluno\n", i +1 );
      students[i].setName(scanner.nextLine());
      students[i].setFirstSemester(scanner.nextFloat());
      students[i].setSecondSemestre(scanner.nextFloat());
    }
  }

  public static void approvedStudents(Student[] students) {
    System.out.println("\nAlunos aprovados:");
    for (byte i = 0; i < students.length; i++) {
      if (students[i].calculateAverage() >= 6)
        System.out.println(students[i].getName());
    }
  }

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String fakeInputString = "4\nJoao Silva\n7.0\n8.5\nMaria Teixeira\n9.2\n6.5\nCarlos Carvalho\n5.0\n6.0\nTeresa Pires\n5.5\n6.5";
    ByteArrayInputStream fakeInput = new ByteArrayInputStream(fakeInputString.getBytes());
    System.setIn(fakeInput);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos alunos serão digitados? ");
    byte quantity = scanner.nextByte();
    Student[] students = new Student[quantity];

    fillStudentVector(students, scanner);
    approvedStudents(students);

  }
}