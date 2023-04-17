import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();

        for (int i = 0; i < a-1; i+=4) {
            System.out.print("long ");
        }
        for (int i = a; i <= a; i+=4) {
            System.out.print("int");
        }
    }
}
