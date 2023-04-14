import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        // 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        // 입력할 숫자의 갯수
        System.out.print("입력할 숫자의 갯수 : ");
        int input = scanner.nextInt();

        // 숫자 입력
        System.out.print("숫자 입력 : ");
        int[] numbers = new int[input];
//        numbers[0] = scanner.nextInt();
//        numbers[1] = scanner.nextInt();
//        numbers[2] = scanner.nextInt();
//        numbers[3] = scanner.nextInt();
//        numbers[4] = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            numbers[i] = scanner.nextInt();
        }


        System.out.print("숫자 출력 : ");
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
        for (int i = 0; i < input; i++) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}

