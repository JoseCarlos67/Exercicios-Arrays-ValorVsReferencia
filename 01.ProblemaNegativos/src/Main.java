import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String fakeInput = "4\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
        ByteArrayInputStream fakeIn = new ByteArrayInputStream(fakeInput.getBytes());
        System.setIn(fakeIn);
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        System.out.println("Quantos números você vai digitar? ");
        n = scanner.nextByte();
        System.out.println(n);

        boolean condition = false;
        while (n > 10 || n < 0) {
            System.out.println("A quantidade de números de ser maior do que 0 e menor do que 10!");
            n = scanner.nextByte();
        }

        int vector[] = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++)
            System.out.println(vector[i]);

        scanner.close();
    }
}