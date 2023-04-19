package api.lang.string;

public class StringTrim {
    public static void main(String[] args) {
        // trim은 좌측, 우측에서 다른 단어가 나오기 직전까지
        // 공백을 전부 제거합니다.
        String trimBefore1 = "               하이";
        System.out.println(trimBefore1.trim());

        String trimBefore2 = "하이                  ";
        System.out.println(trimBefore2.trim());

    }
}
