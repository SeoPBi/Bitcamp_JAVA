public class ParseIntExxample {
    public static void main(String[] args) {
        String str = "2000";
        int year = Integer.parseInt(str);

        // 문자열에서 숫자열로 변환 후 1을 추가
        System.out.println(year + 1);

        // 문자열 자체에서 1을 추가
        System.out.println(str + 1);

        // 숫자로 바꿀 수 없는 문자
        String str2 = "abcd";
        Integer.parseInt(str2);
        System.out.println(str2);
    }
}
