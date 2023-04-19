import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 첫 번째 주사위의 눈의 개수
        int m = sc.nextInt();  // 두 번째 주사위의 눈의 개수

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
