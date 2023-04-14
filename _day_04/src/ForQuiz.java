public class ForQuiz {
    public static void main(String[] args) {
        // 랜덤 구구단을 만들어주세요
        // 구구단의 범위는 1~9까지
        // Math.random를 1~9로 출력되게끔

        int number = (int) (Math.random() * 9) + 1;
        System.out.println(number);

        for (int i = 1; i <= 9; i++) {
            System.out.printf("\n%d * %d = %d", number, i, number * i);

        }
    }
}