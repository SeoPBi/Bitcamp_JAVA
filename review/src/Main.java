import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int A = scanner.nextInt();
       int B = scanner.nextInt();
       int C = scanner.nextInt();

       int D = B + C;

       if(A < 24 && D < 60) {
           System.out.printf("%d %d", A,D);
       } else if (A + D < 24 && D > 60) {
               A = A + (D / 60);
               B = D % 60;
               System.out.printf("%d %d", A, B);
       } else if (A + D > 24) {
           A = (A + (D / 60)) % 24;
           B = D % 60;
           System.out.printf("%d %d", A, B);
       }
    }
}
