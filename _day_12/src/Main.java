import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int ea = scanner.nextInt();


        for (int i = 0; i < ea; i++) {
            int list = scanner.nextInt();
            int listPrice = scanner.nextInt();

            int guessTotal = total - (list * listPrice);
        }

        if (total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}