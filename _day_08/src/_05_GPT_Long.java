import java.util.Scanner;

public class _05_GPT_Long {
    public static void main(String[] args) {
        Long();
    }

    public static void Long() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.length() > b.length()) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
