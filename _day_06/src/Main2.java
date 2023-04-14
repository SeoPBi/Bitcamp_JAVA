import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = b % 10;
        int d = (b / 10) % 10;
        int e = b / 100;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println("----------");
        System.out.println(a * c);
        System.out.println(a * d);
        System.out.println(a * e);
        System.out.println(a * b);


    }
}