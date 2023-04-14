import java.util.Scanner;

public class DowhileExample {
    public static void main(String[] args) {
//        배달어플은 첫 구매시 구매내역이 0원이어도 혜택을 주고
//        그 뒤로는 특정 구매금액이 충족되어야 혜택을 줍니다
//        do ~ while을 이용해 이런 상황을 구현할 수 있습니다.

        int prevorderPrice = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("할인 혜택을 받았습니다.");
            System.out.println("다음 구매 금액은?");
            prevorderPrice = scanner.nextInt();
        } while (prevorderPrice >= 15000);

        scanner.close();
    }
}
