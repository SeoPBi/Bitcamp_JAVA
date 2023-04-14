import java.util.Scanner;

public class WhileQuiz {
    public static void main(String[] args) {
        // 컴퓨터랑 스무고개 수 맞추기를 해보겠습니다.

        // 이 프로그램은 먼저 math.random()을 이용해서 수를 하나 얻습니다.
        int comValue = (int)(Math.random() * 101);

        // 스캐너를 생성해주세요.
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 ~ 100 사이의 숫자를 입력해주세요.");
        // 사용자에게 숫자를 입력받게 해 주세요.
        int userValue = scanner.nextInt();

        // 컴퓨터의 값과 유저의 값이 일치해야만 종료하므로, 불일치시엔 계속 진행하도록 처리
        while (comValue != userValue) {
            // 불일치라면 먼저 업인지, 다운인지 알려주기
            System.out.println("값이 다릅니다");
            if(comValue < userValue) {
                System.out.println("down");
            } else {
                System.out.println("up");
            }
        // 사용자한테 userValue를 다시 입력받기
            System.out.println("다시 입력해주세요.");
            userValue = scanner.nextInt();
        }
        System.out.println("정답입니다.");
    }
}
