import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou o número: " + y);

        sc.close();
    }
}
