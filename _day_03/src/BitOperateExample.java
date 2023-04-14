public class BitOperateExample {
    public static void main(String[] args) {
        byte a = 5; // 00000101
        byte b = 3; // 00000011

        //비트곱(and, &)
        System.out.println(a & b);

        //비트합(or, |)
        System.out.println(a | b);

        //배타적 논리합(xor)
        System.out.println(a ^ b);
    }
}
