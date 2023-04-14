//import java.util.Scanner;

public class ForStarQuiz1 {
    public static void main(String[] args) {
        // 중첩 반복문을 사용하셔야 합니다.
        // 바깥쪽 반복문은 세로 길이를 나타냅니다.
        // 안쪽 반복문은 별의 개수인데 점점 늘어나는 변수를 이용해(반복문에 점점 증가하는 요소가 있음)
        // 줄이 바뀔때마다 별 개수가 늘어나게 처리해주세요.

        // 추가 요구사항 : 사용자에게 스캐너로 층수를 입력받게 고쳐주세요.

//        Scanner scanner = new Scanner(System.in);
        int input = 5;

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
