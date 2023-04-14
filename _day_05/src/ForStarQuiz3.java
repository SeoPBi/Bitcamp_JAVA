import java.util.Scanner;

public class ForStarQuiz3 {
    public static void main(String[] args) {
//             *
//            **
//           ***
//          ****
//         *****
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = input-i; j >= 1; j--) {
                System.out.print(" ");
            } // j for문 닫는 부분
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            } // k for문 닫는 부분
            System.out.println();
        }// i for문 닫는부분
    }
}
