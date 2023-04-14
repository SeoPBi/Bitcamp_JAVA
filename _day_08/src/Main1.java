import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 시
        int B = scanner.nextInt(); // 분
        int C = scanner.nextInt(); // 소요시간

        int T = B + C; // 분 + 소요시간

        if (A >= 24) {
            A %= 24;
        }

        A += T / 60;
        if (A >= 24) {
            A %= 24;
        }

        int minute = T % 60;
        System.out.printf("%d %d", A, minute);
    }
}
