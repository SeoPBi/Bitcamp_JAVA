import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A == B && B == C && C == A) {
            System.out.println(10000 + (1000 * A));
        } else if (A == B) {
                System.out.println(1000 + (100 * A));
            } else if (B == C) {
                System.out.println(1000 + (100 * B));
            } else if (C == A) {
                System.out.println(1000 + (100 * C));
        } else if (A != B || B != C) {
           if (A > B && A > C) {
               System.out.println(A * 100);
           } else if (B > A && B > C) {
               System.out.println(B * 100);
           } else if (C > A && C > B) {
               System.out.println(C * 100);
           }
        }
    }
}
