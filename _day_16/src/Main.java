import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int sum = 0;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(br.readLine());
                sum += num;
            }
            System.out.println("합계: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
