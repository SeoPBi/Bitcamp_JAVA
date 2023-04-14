import java.util.Scanner;

public class _03_GPT_length {
    public static void main(String[] args) {
        length();
    }
    public static String length() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input.length());
        return input;
    }
}
