import java.util.Scanner;

public class _04_GPT_numberDeter {
    public static void main(String[] args) {
        checkNumber();
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        if (input == (int)input) {
            System.out.println("정수다");
        } else {
            System.out.println("소수");
        }
    }
}

