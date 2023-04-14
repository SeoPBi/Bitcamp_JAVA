public class ShortCircuitExample {
    public static void main(String[] args) {
        
        int b = 0;
        b %= 3;
        b = b % 3;
        System.out.println(b);
        
        System.out.println(true & 3 / 3 == 1);

        System.out.println(true || (5 / 2) == 3);
    }
}
