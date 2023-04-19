package api.lang.string;

public class StringReplace {
    public static void main(String[] args) {
        // 자바는 15버전부터 멀티라인 문자열을 지원합니다.
        // 자바 문자열은 여닫는 "를 한줄에 작성해야 했습니다.
        // String a = "가나다라";(허용)
        // String a = "가나다라
        //              마바사";(허용안함)

        // 여닫는 따옴표를 여러 줄에 걸쳐서 작성할때는 """ 세 개를 이용합니다.
        // """를 사용한 줄에는 문자열을 작성할 수 없고, 사이에만 작성할 수 있습니다.
        String notice = """
              파이썬 꿈나무
              현섭
              목표 백준 플래
              """;
        System.out.println(notice);
        // replace()는 String을 리턴하고, 첫 단어를 두 번째 단어로 바꿔줍니다.
        String newNotice = notice.replace("파이썬", "자바");
        System.out.println(newNotice);
    }
}
