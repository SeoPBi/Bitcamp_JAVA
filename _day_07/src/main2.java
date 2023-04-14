import java.lang.reflect.Array;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int a = scanner.nextInt();
        int[] b = new int[a];

        for (int i = 0; i <= a; i++) {
            b[i] = scanner.nextInt();
        }

        int max = b[0];
        int min = b[0];

        for (int i = 0; i < a; i++) {
            if(max < b[i]) {
                max = b[i];
            }
            if(min > b[i]) {
                min = b[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
