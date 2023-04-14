import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("직급을 입력해주세요.");
        String input = scanner.nextLine();
        String[] rank = {"사원", "대리", "과장", "차장", "부장"};

        switch (input) {
            case "사원" :
                System.out.printf("%s의 급여는 200만원입니다.", rank[0]);

            case "대리" :
                System.out.printf("%s의 급여는 300만원입니다.", rank[1]);

            case "과장" :
                System.out.printf("%s의 급여는 400만원입니다.", rank[2]);

            case "차장" :
                System.out.printf("%s의 급여는 500만원입니다.", rank[3]);

            case "부장" :
                System.out.printf("%s의 급여는 600만원입니다.", rank[4]);

            default:
                System.out.println("없는 직급입니다.");
        }
    }
}
