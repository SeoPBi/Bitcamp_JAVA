package review;

import java.util.Scanner;
import java.util.Random;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100) + 1; // 1부터 100까지의 랜덤한 숫자 생성
        int guess;

        System.out.print("제시된 숫자를 맞춰보세요 (1부터 100까지의 정수): ");

        for (int i = 1; i <= 10; i++) { // 최대 10번 시도
            guess = scanner.nextInt();

            if (guess == answer) { // 정답을 맞추면
                System.out.println("축하합니다! " + i + "번째 시도에서 맞췄습니다.");
                break; // for문 종료
            } else if (guess < answer) {
                System.out.print("더 큰 숫자를 입력하세요. : ");
            } else {
                System.out.print("더 작은 숫자를 입력하세요. : ");
            }
        }
        System.out.println("정답은 " + answer + "입니다.");
    }
}
